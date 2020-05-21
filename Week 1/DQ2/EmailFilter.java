import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/EmailFilter")
public class EmailFilter implements Filter 
{
    public EmailFilter() 
    {
    }
	public void destroy() 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		int atcheck = email.indexOf('@');
		if(atcheck == -1)
		{
			out.println("<h3>ERROR: E-mail must contain an @ symbol!</h3>");
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
