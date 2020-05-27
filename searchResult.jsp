<%@ page import="java.util.*, hris.bean.*, hris.controller.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Search Result List</title>
  <link rel="stylesheet" href="table.css">
</head>

<body>
  <a href="user.jsp"><button type="button">User</button></a>
  <hr>

  <div id="wrapper" class="wrapper">
    <div id="header" class="header">
      <h2 style="text-align: center;">Employee Full List</h2>
    </div>
  </div>
  
  <!-- <div class="container" id="salary"> -->

  <div class="container" id="qualification">
    <div class="content" id="content">
      <table>
        <tr>
          <th>Employee Id</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>State</th>
          <th>City</th>
          <th>Date of Birth</th>
          <th>Phone No</th>
          <th>Email</th>
          <th>Qualification</th>
          <th>Post Level</th>
          <th>Joining Date</th>
          <th>Branch Location</th>
          <th>Department Name</th>
          <th>Salary</th>
        </tr>

        
          <c:forEach var="employeeBean" items="${salaryList}">
            <tr>
              <td> ${employeeBean.employeeId} </td>
              <td> ${employeeBean.firstName} </td>
              <td> ${employeeBean.lastName} </td>
              <td> ${employeeBean.state} </td>
              <td> ${employeeBean.city} </td>
              <td> ${employeeBean.dateOfBirth} </td>
              <td> ${employeeBean.phoneNo} </td>
              <td> ${employeeBean.email} </td>
              <td> ${employeeBean.qualification} </td>
              <td> ${employeeBean.postLevel} </td>
              <td> ${employeeBean.joiningDate} </td>
              <td> ${employeeBean.branchLocation} </td>
              <td> ${employeeBean.departmentName} </td>
              <td> ${employeeBean.salary} </td>
            </tr>
          </c:forEach>

          <c:forEach var="employeeBean" items="${qualificationList}">  
            <tr>
              <td> ${employeeBean.employeeId} </td>
              <td> ${employeeBean.firstName} </td>
              <td> ${employeeBean.lastName} </td>
              <td> ${employeeBean.state} </td>
              <td> ${employeeBean.city} </td>
              <td> ${employeeBean.dateOfBirth} </td>
              <td> ${employeeBean.phoneNo} </td>
              <td> ${employeeBean.email} </td>
              <td> ${employeeBean.qualification} </td>
              <td> ${employeeBean.postLevel} </td>
              <td> ${employeeBean.joiningDate} </td>
              <td> ${employeeBean.branchLocation} </td>
              <td> ${employeeBean.departmentName} </td>
              <td> ${employeeBean.salary} </td>
            </tr>
          </c:forEach>

          <c:forEach var="employeeBean" items="${locationList}">  
            <tr>
              <td> ${employeeBean.employeeId} </td>
              <td> ${employeeBean.firstName} </td>
              <td> ${employeeBean.lastName} </td>
              <td> ${employeeBean.state} </td>
              <td> ${employeeBean.city} </td>
              <td> ${employeeBean.dateOfBirth} </td>
              <td> ${employeeBean.phoneNo} </td>
              <td> ${employeeBean.email} </td>
              <td> ${employeeBean.qualification} </td>
              <td> ${employeeBean.postLevel} </td>
              <td> ${employeeBean.joiningDate} </td>
              <td> ${employeeBean.branchLocation} </td>
              <td> ${employeeBean.departmentName} </td>
              <td> ${employeeBean.salary} </td>
            </tr>
          </c:forEach>
          
      </table>
    </div>
  </div>


</body>

</html>