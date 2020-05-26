<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>HomePage</title>
</head>

<body>
  <div class="home">
    <c:if test="${eLogin == null}">
      <input type="button" value="Login" onclick="window.location.href='/Hris/login.jsp'">
    </c:if>
    <c:if test="${eLogin != null}">
      <input type="button" value="Welcome,${eLogin.firstName}" onclick="window.location.href='/Hris/user.jsp'">
      <form action="/Hris/logout" method="GET">
        <input type="hidden" name="command" value="LOGOUT">
        <input type="submit" value="Logout">
      </form>
    </c:if>
  </div>
</body>

</html>