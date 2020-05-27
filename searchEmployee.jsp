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
    <hr><br>
    <form action="/Hris/search" method="GET" id="form" class="form">
      <input type="hidden" name="command" value="A">
      <div class="form-control" style="display: block;">
        <label for="lessThan">Salary Less than</label>
        <input type="text" name="lessThan" required>
      </div><br>
      <div class="form-control" style="display: block;">
        <label for="greaterThan">Salary Greater than</label>
        <input type="text" name="greaterThan" required>
      </div><br>
      <input type="submit" value="Submit">
    </form>

    <br>
    <hr><br>

    <form action="/Hris/search" method="GET">
      <input type="hidden" name="command" value="Q">
      <div class="form-control" style="display: block;">
        <label for="qualification">Qualification</label>
        <select name="qualification">
          <option value="M.B.A.">MBA</option>
          <option value="M.C.A.">MCA</option>
          <option value="B.S.C.I.T.">BSCIT</option>
        </select><br><br>
        <div class="form-control" style="display: block;">
          <label for="postLevel">Post Level</label>
          <select name="postLevel">
            <option value="E">Employee</option>
            <option value="M">Manager</option>
          </select>
        </div><br>
        <input type="submit" value="Submit" style="display: block;">
    </form>

    <br>
    <hr><br>               

    <form action="/Hris/search" method="GET">
      <input type="hidden" name="command" value="L">
      <div class="form-control" style="display: block;">
        <label for="state">State</label>
        <select name="state" required>
          <option value="Gujarat">Gujarat</option>
          <option value="Tamil Nadu">Tamil Nadu</option>
          <option value="Andhra Pradesh">Andhra Pradesh</option>
          <option value="Karnataka">Karnataka</option>
          <option value="Maharashtra">Maharashtra</option>
          <option value="Bihar">Bihar</option>
          <option value="Uttar Pradesh">Uttar Pradesh</option>
          <option value="Kerala">Kerala</option>
        </select>
      </div><br>
      <div class="form-control" style="display: block;">
        <label for="city">City</label>
        <select name="city" required>
          <option value="Bharuch">Bharuch</option>
          <option value="Chennai">Chennai</option>
          <option value="Malkajgiri">Malkajgiri</option>
          <option value="Mumbai">Mumbai</option>
          <option value="Gaya">Gaya</option>
          <option value="Badaun">Badaun</option>
          <option value="Varanasi">Varanasi</option>
          <option value="Cochin">Cochin</option>
        </select>
      </div><br>
      <input type="submit" value="Submit" style="display: block;">
    </form>



  </div>
</body>

</html>