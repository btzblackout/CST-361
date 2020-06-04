
public class Materials 
{
	public static String getBlade(String blade)
	{
		switch(blade)
		{
			case "SWORD": 
			{
				blade = "iron";
				break;
			}
			case "MACE":
			{
				blade = "mithril";
				break;
			}
			case "AXE":
			{
				blade = "steel";
				break;
			}
		}
		return blade;	
	}
	public static String getHandle(String handle)
	{
		switch(handle) 
		{
			case "SWORD": 
			{
				handle = "oak";
				break;
			}
			case "MACE":
			{
				handle = "yew";
				break;
			}
			case "AXE":
			{
				handle = "ash";
				break;
			}
		}
		return handle;
	}
	public static String getHilt(String hilt)
	{
		switch(hilt) 
		{
			case "SWORD": 
			{
				hilt = "silver";
				break;
			}
			case "MACE":
			{
				hilt = "leather";
				break;
			}
			case "AXE":
			{
				hilt = "wooden";
				break;
			}
		}
		return hilt;
	}
}
