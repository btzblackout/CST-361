import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/PasswordFilter")
public class PasswordFilter implements Filter 
{
    public PasswordFilter() 
    {
    }
	public void destroy() 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		String password = request.getParameter("password");
		if(password.equals(""))
		{
			out.println("<h3>ERROR: Password cannot be blank!</h3>");
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
