<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>



<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

<title>Student Management</title>
<!-- 
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
 -->
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>

</head>

<body ng-app="myApp" class="ng-cloak">

	<div class="generic-container" ng-controller="getController">

		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">Student Management Table</h4>
			
										<!-- form-group// -->
					
					<button id="btn-id" type="button" class="btn btn-primary" ng-click="getfunction()">Get All Students</button>
					<p class="text-center">
					<table class="table table-dark table-hover">
						<thead>
							<tr>
								<th>StudentName</th>
								<th>Branch</th>
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="user in response">
								<td>{{user.username}}</td>
								<td>{{user.branch}}</td>
								<td><button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Edit</button> </td>	
								<td><button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Remove</button></td>
							</tr>


						</tbody>


					</table>
					
				<!-- 	<a href="/WEB-INF/views/users.jsp">Back to Register Page</a>  -->
					

				</form>
			</article>
		</div>
		<!-- card.// -->

	</div>
	<!--container end.//-->

	<br>
	<br>
	<article class="bg-secondary mb-3">
		<div class="card-body text-center">
			<h3 class="text-white mt-3">Bootstrap 4 UI KIT</h3>
			<p class="h5 text-white">Simple Student CRUD Application</p>
			<br>

		</div>
		<br> <br>
	</article>

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-resource.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/user_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/user_controller.js' />"></script>



</body>
</html>
