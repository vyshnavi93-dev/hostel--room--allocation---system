import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/allocateRoom")

public class AllocateRoomServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            
           Connection con = DBConnection.getConnection();
con.setAutoCommit(false);

PreparedStatement ps = con.prepareStatement(
"UPDATE rooms SET occupied=occupied+1 WHERE room_no=? AND occupied<capacity");

ps.setInt(1, Integer.parseInt(req.getParameter("room")));
ps.executeUpdate();

con.commit();
res.sendRedirect("dashboard.jsp");

} catch(Exception e){
    con.rollback();
    e.printStackTrace();
} 