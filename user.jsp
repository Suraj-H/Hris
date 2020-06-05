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
      <input type="hidden" name="command" value="LOGOUT">
      <input type="button" value="Home" onclick="window.location.href='index.jsp; return false;'">
      <form action="/Hris/eProfile" method="GET">
        <input type="hidden" name="command" value="PROFILE">
        <input type="hidden" name="id" value="${eLogin.id}">
        <input type="submit" value="Profile">
      </form>
      <input type="button" value="List Employee" onclick="window.location.href='/Hris/listEmployees'">
      <input type="button" value="Add Employee" onclick="window.location.href='addEmployee.jsp; return false;'">
      <input type="button" value="Search Employee" onclick="window.location.href='searchEmployee.jsp; return false;'">
      <form action="/Hris/logout" method="GET">
        <input type="hidden" name="command" value="LOGOUT">
        <input type="submit" value="Logout">
      </form>
    </div>
    <hr>
  </div>
</body>

</html>