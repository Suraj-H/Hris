<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Profile</title>
</head>

<body>
  <div class="container">
    <div class="user">
      <form action="/Hris/logout" method="GET">
        <button type="submit" name="logout">Logout</button><br><br>
      </form>

      <a href="index.jsp"><button type="button">Home</button></a>
      <a href="editInfo.jsp"><button type="button">Edit Info</button></a>
      <a href="getInfo.jsp"><button type="button">Get Info</button></a>
      <a href="viewDetails.jsp"><button type="button">Employee List</button></a>
      <a href="addEmployee.jsp"><button type="button">Add Employee</button></a>
    </div>
    <hr>
  </div>

  <%
    if (session.getAttribute("employee") != null) {
      out.println("session not null!");
    } else {
      out.println("session null!");
    }
  %>
</body>

</html>