import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/PasswordVerifyFilter")
public class PasswordVerifyFilter implements Filter 
{
    public PasswordVerifyFilter() 
    {
    }
	public void destroy() 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		String password2 = request.getParameter("password2");
		String password = request.getParameter("password");
		if(password.equals(password2))
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("<h3>ERROR: Passwords must match!</h3>");
		}
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
}
