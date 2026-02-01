import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/payment")

public class PaymentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
              "INSERT INTO payments(student_id,amount) VALUES (?,?)");
            ps.setInt(1, Integer.parseInt(req.getParameter("id")));
            ps.setInt(2, Integer.parseInt(req.getParameter("amount")));
            ps.executeUpdate();
            res.sendRedirect("dashboard.jsp");
        } catch(Exception e){ e.printStackTrace(); }
    }
}