<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
<form method="post" action="add">
<div class="form-group">
<h2 style="background-color:red ; color:black;text-align:center">AD for:${sessionScope.id}</h2><br>
<h2>Add ad details</h2>
<input type="hidden" value= "${ sessionScope.id}" name="lol"/>


<label>Posting title :</label><br><input type="text" name="title" class="form-control"/><br>
<label>city or neighbourhood:</label><br>  <input type="text" name="city" class="form-control"/><br>
<label>POSTAL code:</label><br> <input type="text" name="pin" class="form-control"/><br>
<label>Description:</label><br>
<textarea rows="5" cols="15" name="desp" class="form-control"></textarea><br>
<h3>contact info:</h3><br>
<label>EMAIL:</label><br> <input type="text" name="email" class="form-control"/><br>
<label>phone:</label><br> <input type="text" name="phone" class="form-control"/><br>
<input type="submit" class="btn btn-primary" value="add" name="add"/>

</div>

</form>
</div>

<div class="col-md-6">
<input type="hidden" value= "${ sessionScope.id}" name="lol"/>
<h2 style="background-color:red ; color:black;text-align:center">Ads LIST : </h2>
<h2>ADs for: ${sessionScope.id} </h2>

		<c:forEach var="ad" items="${ad}">
			
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Ad for:${ad.id}</h5>
     <h6 class="card-subtitle mb-2 text-muted"></h6>
    <p class="card-text">Posting title: ${ad.title} <br>City: ${ad.city}<br> postal code: ${ad.pin}<br>Description:  ${ad.desp}<br>email: ${ad.email}<br>phone:  ${ad.phone}</p>
    
    
    <a href="reply.jsp" class="btn btn-primary">Reply</a>
  </div>
</div>
			
		</c:forEach>
	
</div>


</div>


</div>


<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</body>
</html>