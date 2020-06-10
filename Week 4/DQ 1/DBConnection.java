import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection implements Serializable
{
	//Variables
	private static final long serialVersionUID = 1L;
	static List<Music> musicList = new ArrayList<Music>();
	static int counter;
	
	//Pull all entries from the DB and update the application.
	public List<Music> getData()
	{
		//Clears the current list of songs for re-populating.
		musicList.clear();
		
		//Access the DB and add each song to the application.
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from songs");
			while(rs.next())
			{
				Music music = new Music();
				music.setSongName(rs.getString(2));
				music.setArtist(rs.getString(3));
				music.setAlbum(rs.getString(4));
				music.setReleaseDate(rs.getInt(5));
				musicList.add(music);
			}
			rs.close();
			st.close();
			con.close();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return musicList;
	}
	
	//Create
	public static void addSong(Music music)
	{
		boolean check = false;
		counter = 0;
		int sizeofList = musicList.size();
		while(check == false && counter < sizeofList)
		{
			if (musicList.get(counter).getSongName().equals(music.getSongName())) 
			{
				System.out.println("The song is already in the DB!");
				check = true;
			}
			counter++;
		}
		if(check == false) 
		{
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
				Statement st = con.createStatement();
			    st.executeUpdate("INSERT INTO `music`.`songs` (`Song Name`, `Artist`, `Album`, `Release Date`) VALUES ('"+music.getSongName()+"', '"+music.getArtist()+"', '"+music.getAlbum()+"', '"+music.getReleaseDate()+"');");
				st.close();
				con.close();
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	//Retrieve 
	public static Music getSong(int id)
	{
		Music m = new Music();
		counter = 0;
		while(counter < musicList.size())
		{
			if (musicList.get(counter).getId() == id) 
			{
				m = musicList.get(counter);
			}
			counter++;
		}
		return m;
	}
	
	//Update
	public static void updateSong(Music music)
	{
		counter = 0;
		while(counter < musicList.size())
		{
			if (musicList.get(counter).getId() == music.getId()) 
			{
				musicList.add(counter, music);
				musicList.remove(counter + 1);
			}
			counter++;
		}
	}
	
	//Delete
	public static void removeSong(int id)
	{
		counter = 0;
		while(counter < musicList.size())
		{
			if (musicList.get(counter).getId() == id) 
			{
				musicList.remove(counter);
			}
			counter++;
		}
	}
}
