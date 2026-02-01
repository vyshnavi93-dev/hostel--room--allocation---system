import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(" view student ")

public class ViewStudentsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
              "SELECT s.id,s.name,s.room_no,r.capacity FROM students s JOIN rooms r ON s.room_no=r.room_no");

            PrintWriter out = res.getWriter();
            while(rs.next()){
                out.println(rs.getInt(1)+" "
                  +rs.getString(2)+" Room:"
                  +rs.getInt(3)+" Capacity:"
                  +rs.getInt(4)+"<br>");
            }
        } catch(Exception e){ e.printStackTrace(); }
    }
}