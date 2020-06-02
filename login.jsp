<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Login Page</title>
</head>

<body>
  <div class="container">
    <form id="form" class="form" action="/Hris/login" method="GET">
      <input type="hidden" name="command" value="LOGIN">
      <h2>Login Page</h2>
      <div class="form-control">
        <label for="username">Username</label>
        <input type="text" name="username" id="username" placeholder="Enter username">
        <small>error message</small>
      </div>
      <div class="form-control">
        <label for="password">Password</label>
        <input type="password" name="password" id="password" placeholder="Enter password">
        <small>error message</small>
      </div>
      <button type="submit">Submit</button>
    </form>
  </div>
</body>

</html>