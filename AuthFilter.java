import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AuthFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            ((HttpServletResponse) res).sendRedirect("login.jsp");
        } else {
            chain.doFilter(req, res);
        }
    }
}