<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update Employee</title>
  <link rel="stylesheet" href="">
</head>

<body>
  <div class="container">
    <h2>Update Employee</h2>
    <form action="/Hris/updateEmployee" method="GET" id="form" class="form">

      <input type="hidden" name="command" value="UPDATE">
      <input type="hidden" name="employeeId" value="${eBean.employeeId}">

      <div class="form-control">
        <input type="text" name="firstName" id="firstName" value="${eBean.firstName}" placeholder="Enter first name">
      </div>
      <div class="form-control">
        <input type="text" name="lastName" id="lastName" value="${eBean.lastName}" placeholder="Enter last name">
      </div>
      <div class="form-control">
        <input type="text" name="state" id="state" value="${eBean.state}" placeholder="Enter state">
      </div>
      <div class="form-control">
        <input type="text" name="city" id="city" value="${eBean.city}" placeholder="Enter city">
      </div>
      <div class="form-control">
        <input type="text" name="dateOfBirth" id="dateOfBirth" value="${eBean.dateOfBirth}"
          placeholder="Enter date of birth">
      </div>
      <div class="form-control">
        <input type="text" name="phoneNo" id="phoneNo" value="${eBean.phoneNo}" placeholder="Enter phone number">
      </div>
      <div class="form-control">
        <input type="text" name="email" id="email" value="${eBean.email}" placeholder="Enter email id">
      </div>
      <div class="form-control">
        <input type="text" name="qualification" id="qualification" value="${eBean.qualification}"
          placeholder="Enter qualification">
      </div>
      <div class="form-control">
        <input type="text" name="postLevel" id="postLevel" value="${eBean.postLevel}" placeholder="Enter post level">
      </div>
      <div class="form-control">
        <input type="text" name="joiningDate" id="joiningDate" value="${eBean.joiningDate}"
          placeholder="Enter joining date">
      </div>
      <div class="form-control">
        <input type="text" name="departmentId" id="departmentId" value="${eBean.departmentId}"
          placeholder="Enter department id">
      </div>
      <div class="form-control">
        <input type="text" name="branchId" id="branchId" value="${eBean.branchId}" placeholder="Enter branch id">
      </div>
      <div class="form-control">
        <input type="text" name="salary" id="salary" value="${eBean.salary}" placeholder="Enter salary">
      </div>
      <button type="submit">Save</button>
    </form>
  </div>
</body>

</html>