<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>New Employee Details</title>
</head>

<body>
  <div class="container">
    <form action="/Hris/addEmployee" method="POST" id="form" class="form">
      <h2>New Employee Details</h2>
      <label for="fullName">fullName: </label> <%= request.getParameter("fullName") %>
      <label for="age">age: </label> <%= request.getParameter("age") %>
      <label for="address">address: </label> <%= request.getParameter("address") %>
      <label for="dateOfBirth">dateOfBirth: </label> <%= request.getParameter("dateOfBirth") %>
      <label for="phoneNo">phoneNo: </label> <%= request.getParameter("phoneNo") %>
      <label for="emailId">emailId: </label> <%= request.getParameter("emailId") %>
      <label for="dateOfBirth">dateOfBirth: </label> <%= request.getParameter("dateOfBirth") %>
    </form>
  </div>
</body>

</html>