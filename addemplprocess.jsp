<%@ page import="bean.EmployeeBean" %>
<%@ page import="bean.EmployeeOpt" %>

<jsp:useBean id="employee" scope="session" class="bean.EmployeeBean" />

<jsp:setProperty property="*" name="employee" />

<a href="index.jsp">index</a><hr>

<%
    boolean status = EmployeeOpt.addEmployee(employee);
   
    if (status) {
        out.println("New employee added successfully.");
    } else {
        out.println("No new employee added.");
    }
%>


