<%@ page import="java.util.*, hris.bean.*, hris.controller.*" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>List Employees</title>
  <link rel="stylesheet" href="table.css">
</head>

<%
  List<Employee> employees = 
    (List<Employee>) request.getAttribute("employeeList");
%>

<body>
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
        </tr>

        <% for (Employee employee : employees) { %>
        
          <tr>
            <td><%= employee.getEmployeeId() %></td>
            <td><%= employee.getFirstName() %></td>
            <td><%= employee.getLastName() %></td>
            <td><%= employee.getState() %></td>
            <td><%= employee.getCity() %></td>
            <td><%= employee.getDateOfBirth() %></td>
            <td><%= employee.getPhoneNo() %></td>
            <td><%= employee.getEmail() %></td>
            <td><%= employee.getQualification() %></td>
            <td><%= employee.getPostLevel() %></td>
            <td><%= employee.getJoiningDate() %></td>
            <td><%= employee.getDepartmentId() %></td>
            <td><%= employee.getBranchId() %></td>
            <td><%= employee.getSalary() %></td>
        </tr>

        <% } %>
      </table>
    </div>
  </div>

</body>

</html>