<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
        <td> ${eProfile.id} </td>
      </tr>
      <tr>
        <td>First Name</td>
        <td> ${eProfile.firstName} </td>
      </tr>
      <tr>
        <td>Last Name</td>
        <td> ${eProfile.lastName} </td>
      </tr>
      <tr>
        <td>Address</td>
        <td> ${eProfile.address} </td>
      </tr>
      <tr>
        <td>Date Of Birth</td>
        <td> ${eProfile.dateOfBirth} </td>
      </tr>
      <tr>
        <td>Phone number</td>
        <td> ${eProfile.phoneNo} </td>
      </tr>
      <tr>
        <td>Email</td>
        <td> ${eProfile.email} </td>
      </tr>
      <tr>
        <td>Qualification</td>
        <td> ${eProfile.qualification} </td>
      </tr>
      <tr>
        <td>Designation</td>
        <td> ${eProfile.designation} </td>
      </tr>
      <tr>
        <td>Joining Date</td>
        <td> ${eProfile.joiningDate} </td>
      </tr>
      <tr>
        <td>Branch</td>
        <td> ${eProfile.branchId}, ${eProfile.branchAddress}, ${eProfile.branchLocation} </td>
      </tr>
      <tr>
        <td>Department</td>
        <td> ${eProfile.departmentId}, ${eProfile.departmentName} </td>
      </tr>
      <tr>
        <td>Salary</td>
        <td> ${eProfile.salary} </td>
      </tr>

    </table>
  </div>
  <hr><br>

  <input type="button" value="User" onclick="window.location.href='user.jsp; return false;'">
  <input type="button" value="Edit" onclick="window.location.href='editProfile.jsp; return false;'">

</body>

</html>