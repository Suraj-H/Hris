<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Search Employee</title>
  <link rel="stylesheet" href="">
</head>

<body>
  <div class="container">
    <h2>Search Employee</h2>
    <hr>
    <form action="/Hris/search" method="GET" id="form" class="form">
      <input type="hidden" name="command" value="A">
      <div class="form-control" style="display: block;">
        <label for="lessThan" style="display: block;">Less than</label>
        <input type="text" name="lessThan">
        <label for="greaterThan" style="display: block;">Greater than</label>
        <input type="text" name="greaterThan">
      </div>
      <input type="submit" value="Submit">
    </form>
    
    <hr>

    <form action="/Hris/search" method="GET">
      <input type="hidden" name="command" value="Q">
      <div class="form-control" style="display: block;">
        <label for="qualification" style="display: block;">Qualification</label>
        <input type="text" name="qualification">
      <div class="form-control" style="display: block;">
        <label for="postLevel" style="display: block;">Post Level</label>
        <input type="text" name="postLevel">
      </div>
      <input type="submit" value="Submit" style="display: block;">
    </form>
  </div>
</body>

</html>