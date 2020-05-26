<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Employee</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <div class="container">
    <h2>Add Employee</h2>
    <form action="/Hris/addEmployee" method="GET" id="form" class="form">
      <input type="hidden" name="command" value="ADD">
      <div class="form-control">
        <input type="text" name="employeeId" id="employeeId" placeholder="Enter employee id">
      </div>
      <div class="form-control">
        <input type="text" name="firstName" id="firstName" placeholder="Enter first name">
      </div>
      <div class="form-control">
        <input type="text" name="lastName" id="lastName" placeholder="Enter last name">
      </div>
      <div class="form-control">
        <input type="text" name="state" id="state" placeholder="Enter state">
      </div>
      <div class="form-control">
        <input type="text" name="city" id="city" placeholder="Enter city">
      </div>
      <div class="form-control">
        <input type="text" name="dateOfBirth" id="dateOfBirth" placeholder="Enter date of birth">
      </div>
      <div class="form-control">
        <input type="text" name="phoneNo" id="phoneNo" placeholder="Enter phone number">
      </div>
      <div class="form-control">
        <input type="text" name="email" id="email" placeholder="Enter email id">
      </div>
      <div class="form-control">
        <input type="text" name="qualification" id="qualification" placeholder="Enter qualification">
      </div>
      <div class="form-control">
        <input type="text" name="postLevel" id="postLevel" placeholder="Enter post level">
      </div>
      <div class="form-control">
        <input type="text" name="joiningDate" id="joiningDate" placeholder="Enter joining date">
      </div>
      <div class="form-control">
        <input type="text" name="departmentId" id="departmentId" placeholder="Enter department id">
      </div>
      <div class="form-control">
        <input type="text" name="branchId" id="branchId" placeholder="Enter branch id">
      </div>
      <div class="form-control">
        <input type="text" name="salary" id="salary" placeholder="Enter salary">
      </div>
      <div class="form-control">
        <input type="text" name="username" id="username" placeholder="Enter username">
      </div>
      <div class="form-control">
        <input type="text" name="password" id="password" placeholder="Enter password">
      </div>
      <button type="submit">Submit</button>
    </form>
  </div>
</body>

</html>