<%@ page import="java.util.*, hris.bean.*, hris.controller.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>List Employees</title>
  <link type="text/css" rel="stylesheet" href="">
</head>

<body>
  <a href="user.jsp"><button type="button">User</button></a>
  <hr>

  <div id="wrapper" class="wrapper">
    <div id="header" class="header">
      <h2 style="text-align: center;">Employee Full List</h2>
    </div>
  </div>
  <div class="container" id="container">
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
          <th>Department Id</th>
          <th>Branch Id</th>
          <th>Salary</th>
          <th>Action</th>
        </tr>

        <c:forEach var="employeeBean" items="${employeeList}">
          
          <c:url var="updateLink" value="updateEmployee">
            <c:param name="command" value="LOAD" />
            <c:param name="employeeId" value="${employeeBean.employeeId}" />
          </c:url>

          <c:url var="deleteLink" value="updateEmployee">
            <c:param name="command" value="DELETE" />
            <c:param name="employeeId" value="${employeeBean.employeeId}" />
          </c:url>
        
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
            <td> ${employeeBean.departmentId} </td>
            <td> ${employeeBean.branchId} </td>
            <td> ${employeeBean.salary} </td>
            <td> 
              <a href="${updateLink}">Update</a> | <a href="${deleteLink}" onclick="if (!(confirm('confirm on delete this employee?'))) return false">Delete</a> 
            </td>
          </tr>
        </c:forEach>

      </table>
    </div>
  </div>

</body>

</html>