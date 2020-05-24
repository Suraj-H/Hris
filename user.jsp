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
      <input type="button" value="List Employee" onclick="window.location.href='/Hris/listEmployees'">
      <input type="button" value="Add Employee" 
        onclick="window.location.href='addEmployee.jsp; return false;'">
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