<%@ page import="java.util.*, bean.*, controller.*" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>List Employees</title>
  <link rel="stylesheet" href="table.css">
</head>

<%
  List<EmployeeBean> employees = 
    (List<EmployeeBean>) request.getAttribute("employeeList");
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
          <th>Full Name</th>
          <th>Age</th>
          <th>Address</th>
          <th>Date of Birth</th>
          <th>Phone No</th>
          <th>Email Id</th>
          <th>Qualification</th>
          <th>Post Level</th>
          <th>Joining Date</th>
          <th>Department Id</th>
          <th>Branch Id</th>
          <th>Salary</th>
        </tr>

        <% for (EmployeeBean employee : employees) { %>
        
          <tr>
            <td><%= employee.getEmployeeId() %></td>
            <td><%= employee.getFullName() %></td>
            <td><%= employee.getAge() %></td>
            <td><%= employee.getAddress() %></td>
            <td><%= employee.getDateOfBirth() %></td>
            <td><%= employee.getPhoneNo() %></td>
            <td><%= employee.getEmailId() %></td>
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