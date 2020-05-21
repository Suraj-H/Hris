<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>HomePage</title>
</head>

<body>
  <div class="home">
    <a href="login.jsp"><button>Login</button></a>
    <a href="about.jsp"><button>About</button></a>
  </div>
  
  <hr>
  <%  if (session.getAttribute("employee") == null) { %>
    <p>user not logged in.</p>  
  <% } else { %>
    <p>user already logged in.</p> 
  <% } %>

</body>

</html>