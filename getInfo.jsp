<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Get Employee Info</title>
</head>

<body>
  <div class="container">
    <form action="/Hris/getInfo" method="POST" id="form" class="form">
      <h2>Fill details</h2>
      <div class="form-control">
        <input type="text" name="employeeId" id="employeeId" placeholder="Enter employee id" style="display: block;">
        <input type="text" name="fullName" id="fullName" placeholder="Enter employee full name" style="display: block;">
        <input type="text" name="employeeId" id="employeeId" placeholder="Enter Employee Id" style="display: block;">
        <input type="text" name="qualification" id="qualification" placeholder="Enter employee qualification"
          style="display: block;">
        <input type="text" name="postLevel" id="postLevel" placeholder="Enter employee post level"
          style="display: block;">
        <input type="text" name="departmentId" id="departmentId" placeholder="Enter department id"
          style="display: block;">
        <input type="text" name="branchId" id="branchId" placeholder="Enter branch id" style="display: block;">
        <input type="text" name="salary" id="salary" placeholder="Enter salary amount" style="display: block;">
      </div>
    </form>
  </div>
</body>

</html>