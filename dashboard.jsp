<h2>Hostel Dashboard</h2>

<form action="AddStudentServlet" method="post">
Name:<input name="name">
Room:<input name="room">
<input type="submit" value="Add Student">
</form>

<form action="AllocateRoomServlet" method="post">
Room:<input name="room">
<input type="submit" value="Allocate Room">
</form>

<form action="PaymentServlet" method="post">
Student ID:<input name="id">
Amount:<input name="amount">
<input type="submit" value="Pay">
</form>

<a href="ViewStudentsServlet">View Students</a>