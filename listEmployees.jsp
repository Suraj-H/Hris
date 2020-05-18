<%@ page import="java.util.*, bean.*, controller.*" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>List Employees</title>
</head>

<%
  List<EmployeeBean> employees = 
    (List<EmployeeBean>) request.getAttribute("employeeList");
%>

<body>

  <%= "Employees:"  %>
  <%= employees %>

</body>

</html>