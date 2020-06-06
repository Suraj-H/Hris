<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Search Employee</title>
  <link rel="stylesheet" href="">
</head>

<body>
  <div class="container">
    <h2>Search Employee</h2>
    <hr><br>
    <form action="/Hris/search" method="GET" id="form" class="form">
      <input type="hidden" name="command" value="A">
      <div class="form-control" style="display: block;">
        <label for="lessThan">Salary Less than</label>
        <input type="text" name="lessThan" required>
      </div><br>
      <div class="form-control" style="display: block;">
        <label for="greaterThan">Salary Greater than</label>
        <input type="text" name="greaterThan" required>
      </div><br>
      <input type="submit" value="Submit">
    </form>

    <br>
    <hr><br>

    <form action="/Hris/search" method="GET">
      <input type="hidden" name="command" value="Q">
      <div class="form-control" style="display: block;">
        <label for="qualification">Qualification</label>
        <select name="qualification">
          <option value="">Choose Qualification</option>
          <option value="B.S.C.I.T.">BSCIT</option>
          <option value="M.B.A.">MBA</option>
          <option value="M.C.A.">MCA</option>
        </select><br><br>
        <div class="form-control" style="display: block;">
          <label for="designation">Designation</label>
          <select name="designation">
            <option value="">Choose Designation</option>
            <option value="Consultant">Consultant</option>
            <option value="Project Manager">Project Manager</option>
            <option value="Software Engineer">Software Engineer</option>
            <option value="Software Trainee">Software Trainee</option>
            <option value="Team Leader">Team Leader</option>
          </select>
        </div><br>
        <input type="submit" value="Submit" style="display: block;">
    </form>

    <br>
    <hr><br>

    <form action="/Hris/search" method="GET">
      <input type="hidden" name="command" value="B">
      <div class="form-control" style="display: block;">
        <label for="branchId">Branch Id</label>
        <input type="text" name="branchId" placeholder="Enter Branch Id">
      </div><br>
      <div class="form-control" style="display: block;">
        <label for="branchLocation">Branch Location</label>
        <select name="branchLocation">
          <option value="">Choose location</option>
          <option value="Ahmadabad">Ahmadabad</option>
          <option value="Bangalor">Bangalor</option>
          <option value="Chennai">Chennai</option>
          <option value="Gurgaon">Gurgaon</option>
          <option value="Hyderabad">Hyderabad</option>
          <option value="Kolkata">Kolkata</option>
          <option value="Lucknow">Lucknow</option>
          <option value="Mumbai">Mumbai</option>
          <option value="Mumbai (Suburban)">Mumbai (Suburban)</option>
          <option value="New Delhi">New Delhi</option>
          <option value="North Goa">North Goa</option>
          <option value="Pune">Pune</option>
          <option value="Thane">Thane</option>
        </select>
      </div><br>
      <div class="form-control" style="display: block;">
        <label for="departmentName">Department Name</label>
        <select name="departmentName">
          <option value="">Choose Department</option>
          <option value="Application developement & Maintenance">Application developement & Maintenance</option>
          <option value="Asset Leverage Solutions">Asset Leverage Solutions</option>
          <option value="Assurance Services">Assurance Services</option>
          <option value="Business Process Outsourcing">Business Process Outsourcing</option>
          <option value="Consulting">Consulting</option>
          <option value="Engineering and Industial Services">Engineering and Industial Services</option>
          <option value="Enterprise Solutions">Enterprise Solutions</option>
          <option value="IT Infrastructure Services">IT Infrastructure Services</option>
          <option value="Cloud Infrastructure">Cloud Infrastructure</option>
          <option value="Automation and AI">Automation and AI</option>
        </select>
      </div><br>
      <input type="submit" value="Submit" style="display: block;">
    </form>

    <br>
    <hr><br>

    <form action="/Hris/search" method="GET">
      <input type="hidden" name="command" value="N">
      <div class="form-control" style="display: block;">
        <label for="firstName">First Name</label>
        <input type="text" name="firstName"><br><br>
        <div class="form-control" style="display: block;">
          <label for="lastName">Last Name</label>
          <input type="text" name="lastName"><br>
        </div><br>
        <input type="submit" value="Submit" style="display: block;">
    </form>

  </div>
</body>

</html>