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
    <form action="/Hris/AddEmployeeServlet.java" method="POST" id="form" class="form">
      <h2>Add Employee</h2>
      <div class="form-control">
        <input type="text" name="employeeId" id="employeeId" placeholder="Enter employee id">
      </div>
      <div class="form-control">
        <input type="text" name="fullName" id="fullName" placeholder="Enter full name">
      </div>
      <div class="form-control">
        <input type="text" name="age" id="age" placeholder="Enter age">
      </div>
      <div class="form-control">
        <input type="text" name="address" id="address" placeholder="Enter address">
      </div>
      <div class="form-control">
        <input type="text" name="dateOfBirth" id="dateOfBirth" placeholder="Enter date of birth">
      </div>
      <div class="form-control">
        <input type="text" name="phoneNo" id="phoneNo" placeholder="Enter phone number">
      </div>
      <div class="form-control">
        <input type="text" name="emailId" id="emailId" placeholder="Enter email id">
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
      <button type="submit">Submit</button>
    </form>
  </div>
</body>

</html>