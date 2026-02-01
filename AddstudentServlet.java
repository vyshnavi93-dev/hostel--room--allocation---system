import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(/"AddStudent")

public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
              "INSERT INTO students(name,room_no) VALUES (?,?)");
            ps.setString(1, req.getParameter("name"));
            ps.setInt(2, Integer.parseInt(req.getParameter("room")));
            ps.executeUpdate();
            res.sendRedirect("dashboard.jsp");
        } catch(Exception e){ e.printStackTrace(); }
    }
}