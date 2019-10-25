<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h1 style="background-color:red ; color:black;text-align:center">AD MANAGER</h1>
<form method="post" action="form">
<div class="container">
<div><h2>What type of posting is this: </h2></div>
<div><br></div>
<div class="radio">
  <label><input type="radio" name="optradio" value="job offered" checked>job offered</label>
</div>
<div class="radio">
  <label><input type="radio" name="optradio" value="gig offered">gig offered</label>
</div>
<div class="radio disabled">
  <label><input type="radio" name="optradio"  value=" resume / job wanted">resume / job wanted</label>
</div>
<div><br></div>
<div class="radio">
  <label><input type="radio" name="optradio" value="housing offered" checked>housing offered</label>
</div>
<div class="radio">
  <label><input type="radio" name="optradio" value="housing wanted" >housing wanted</label>
</div>
<div><br></div>
<div class="radio disabled">
  <label><input type="radio" name="optradio" value="for sale by owner" >for sale by owner</label>
</div>

<div class="radio">
  <label><input type="radio" name="optradio"  value="for sale by dealer" checked>for sale by dealer</label>
</div>
<div class="radio">
  <label><input type="radio" name="optradio"  value="wanted by owner">wanted by owner</label>
</div>
<div class="radio disabled">
  <label><input type="radio" name="optradio"  value="wanted by dealer">wanted by dealer</label>
</div>
<div><br></div>
<div class="radio">
  <label><input type="radio" name="optradio"  value="service offered" checked>service offered</label>
</div>
<div><br></div>
<div class="radio">
  <label><input type="radio" name="optradio" value="community">community</label>
</div>
<div class="radio disabled">
  <label><input type="radio" name="optradio" value="event/class">event/class</label>
</div>
</div>
<input type="submit" class="btn btn-danger" value="contiue">
</form>





<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</body>
</html>