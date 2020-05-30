/*	AUTHOR: Raymond Lawson
 * 	CST-361
 * 	Developed for Week 2 DQ 2
 * 	
 * 	This is the controller for the project.
 */

//imports
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Controller 
{
	public String onClick()
	{
		//get the user values from the input form
		FacesContext fc = FacesContext.getCurrentInstance();
		User user = fc.getApplication().evaluateExpressionGet(fc, "#{user}", User.class);
		
		// put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user",user);
		
		//Returns the user-page.xhtml
		return "user-page.xhtml";
	}
}

