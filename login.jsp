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
    <form id="form" class="form" action="/Hris/login" method="POST">
      <h2>Login Page</h2>
      <div class="form-control">
        <label for="j_username">Username</label>
        <input type="text" name="j_username" id="j_username" placeholder="Enter username">
        <small>error message</small>
      </div>
      <div class="form-control">
        <label for="j_password">Password</label>
        <input type="password" name="j_password" id="j_password" placeholder="Enter password">
        <small>error message</small>
      </div>
      <button type="submit">Submit</button>
    </form>
  </div>

  
</body>

</html>