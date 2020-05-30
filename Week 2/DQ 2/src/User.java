/*	AUTHOR: Raymond Lawson
 * 	CST-361
 * 	Developed for Week 2 DQ 2
 * 	
 * 	This is the controller for the project.
 */

//imports
import javax.faces.bean.ManagedBean;

@ManagedBean
public class User 
{
	private String username;
	private String password;
	
	public User()
	{
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
