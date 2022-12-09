<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add New Friend</title>
		
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		
		<link rel="stylesheet" href="css/main.css">
	</head>
	<body>
		<main>
			<h2><center>Add Friend Form</center></h2>
			<form method="post" action="addFriend">
			  <div class="form-group">
			    <label for="name">Name:</label>
			    <input type="text" class="form-control" name="name" placeholder="Enter friend's name">
			  </div>
			  
			  <div class="form-group">
			    <label for="email">Email:</label>
			    <input type="email" class="form-control" name="email" placeholder="Enter friend's email">
			  </div>
			  
			  <div class="form-group">
			    <label for="age">Age:</label>
			    <input type="number" class="form-control" name="age" placeholder="Enter friend's age">
			  </div>
			  
			  <div class="form-group">
			    <label for="favouriteColor">Favourite Color:</label>
			    <input type="text" class="form-control" name="favouriteColor" placeholder="Enter friend's favourite color">
			  </div>
			    
			  <input type="submit" class="btn btn-primary" id="submit-btn" value="Add Friend">
			</form>
		</main>
	</body>
</html>