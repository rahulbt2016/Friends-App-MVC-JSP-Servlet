<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page import="java.io.*, java.util.*, com.rahul.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Friend List</title>
		
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		
		<link rel="stylesheet" href="css/main.css">
		
	</head>
	<body>
		<div id="friend-table">
			<h2><center>Rahul's Friends</center></h2>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Age</th>
						<th>Favourite Color</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<%
						DAO_81_FriendDao friendDao = new DAO_81_FriendDao();
						ArrayList<M_81_Friend> friends = friendDao.getFriends();
						request.setAttribute("friends", friends);
					%>
					
					 <c:forEach items="${friends}" var="friend">
				        <tr>
							<td>${friend.id}</td>
							<td>${friend.name}</td>
							<td>${friend.email}</td>
							<td>${friend.age}</td>
							<td>${friend.favouriteColor}</td>
							<td><a href="deleteFriend?id=${friend.id}" title="Delete Friend"><i class="fa fa-trash" style="color: red; font-size: 18px"></i></a></td>
						</tr>
				    </c:forEach>
					
				</tbody>
			</table>
			
			<a href="V_81_AddFriend.jsp"><i class="fa fa-plus"></i> Add a New Friend</a>
		</div>
	</body>
</html>