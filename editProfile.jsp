<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update Employee</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <div class="container">
    <h2>Update Profile</h2>
    <form action="/Hris/profile" method="GET" id="form" class="form">

      <input type="hidden" name="command" value="EDIT_PROFILE">
      <input type="hidden" name="id" value="${eProfile.id}">
      <input type="hidden" name="branchLocation value="${eProfile.branchLocation}">
      <input type="hidden" name="branchAddress" value="${eProfile.branchAddress}">
      <input type="hidden" name="departmentName" value="${eProfile.departmentName}">

      <div class="form-control">
        <input type="text" name="firstName" id="firstName" value="${eLogin.firstName}" placeholder="Enter first name">
      </div>
      <div class="form-control">
        <input type="text" name="lastName" id="lastName" value="${eLogin.lastName}" placeholder="Enter last name">
      </div>
      <div class="form-control">
        <input type="text" name="address" id="address" value="${eLogin.address}" placeholder="Enter address">
      </div>
      <div class="form-control">
        <input type="text" name="dateOfBirth" id="dateOfBirth" value="${eLogin.dateOfBirth}"
          placeholder="Enter date of birth">
      </div>
      <div class="form-control">
        <input type="text" name="phoneNo" id="phoneNo" value="${eLogin.phoneNo}" placeholder="Enter phone number">
      </div>
      <div class="form-control">
        <input type="text" name="email" id="email" value="${eLogin.email}" placeholder="Enter email id">
      </div>
      <div class="form-control">
        <input type="text" name="qualification" id="qualification" value="${eLogin.qualification}"
          placeholder="Enter qualification">
      </div>
      <div class="form-control">
        <input type="text" name="designation" id="designation" value="${eLogin.designation}"
          placeholder="Enter designation">
      </div>
      <div class="form-control">
        <input type="text" name="joiningDate" id="joiningDate" value="${eLogin.joiningDate}"
          placeholder="Enter joining date">
      </div>
      <div class="form-control">
        <input type="text" name="departmentId" id="departmentId" value="${eLogin.departmentId}"
          placeholder="Enter department id">
      </div>
      <div class="form-control">
        <input type="text" name="branchId" id="branchId" value="${eLogin.branchId}" placeholder="Enter branch id">
      </div>
      <div class="form-control">
        <input type="text" name="salary" id="salary" value="${eLogin.salary}" placeholder="Enter salary">
      </div>
      <button type="submit">Save</button>
    </form>
  </div>
</body>

</html>