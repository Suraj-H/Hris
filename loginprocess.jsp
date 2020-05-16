<%@ page import="bean.LoginDao" %>
<a href="index.jsp">index</a>
<a href="logout.jsp">logout</a>
<a href="changepassword.jsp">changepassword</a>
<hr>
<jsp:useBean id="obj" class="bean.LoginBean" />

<jsp:setProperty property="*" name="obj" />

<% 
    boolean status = LoginDao.validate(obj); 
    if (status) {
        out.println("You are successfully logged in"); 
        session.setAttribute("session","TRUE"); 
    } else {
        out.print("Sorry, username or password error"); 
%>

<% } %>

