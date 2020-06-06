<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Profile Info</title>
</head>

<body>
  <div class="container">
    <table>

      <tr>
        <td>Id</td>
        <td> ${eLogin.id} </td>
      </tr>
      <tr>
        <td>First Name</td>
        <td> ${eLogin.firstName} </td>
      </tr>
      <tr>
        <td>Last Name</td>
        <td> ${eLogin.lastName} </td>
      </tr>
      <tr>
        <td>State</td>
        <td> ${eLogin.address} </td>
      </tr>
      <tr>
        <td>Date Of Birth</td>
        <td> ${eLogin.dateOfBirth} </td>
      </tr>
      <tr>
        <td>Phone number</td>
        <td> ${eLogin.phoneNo} </td>
      </tr>
      <tr>
        <td>Email</td>
        <td> ${eLogin.email} </td>
      </tr>
      <tr>
        <td>Qualification</td>
        <td> ${eLogin.qualification} </td>
      </tr>
      <tr>
        <td>Designation</td>
        <td> ${eLogin.designation} </td>
      </tr>
      <tr>
        <td>Joining Date</td>
        <td> ${eLogin.joiningDate} </td>
      </tr>
      <tr>
        <td>Branch</td>
        <td> ${eLogin.branchId}, ${eLogin.branchAddress}, ${eLogin.branchLocation} </td>
      </tr>
      <tr>
        <td>Department</td>
        <td> ${eLogin.departmentId}, ${eLogin.departmentName} </td>
      </tr>
      <tr>
        <td>Salary</td>
        <td> ${eLogin.salary} </td>
      </tr>

    </table>
  </div>
</body>

</html>