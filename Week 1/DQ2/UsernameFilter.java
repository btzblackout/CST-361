import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/UsernameFilter")
public class UsernameFilter implements Filter 
{
    public UsernameFilter() 
    {
    }

	public void destroy() 
	{
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		if(username.equals(""))
		{
			out.println("<h3>ERROR: Username cannot be blank!</h3>");
		}
		else if (username.length() < 8)
		{
			out.println("<h3>ERROR: Username must be at least 8 characters long!</h3>");
		}
		else
		{
			chain.doFilter(request, response);
		}
		
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
}
