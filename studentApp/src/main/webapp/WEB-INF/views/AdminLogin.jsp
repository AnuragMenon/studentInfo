<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>Admin login</title>
<!-- 
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
 -->
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>

</head>

<body ng-app="myApp" class="ng-cloak">

	<div ng-controller="PostAdminController">
		<br>
		<p class="text-center">Admin Login Page</p>
		<hr>


		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">

				<form ng-submit="submitAdminForm()" name="myForm" > <!--  action= "page1">-->
					<!--FORM SUBMIT CONTROL  -->
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>

						<input name="" class="form-control" placeholder="User Name"
							type="text" id="studentName" ng-model="userName">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-paw"></i>
							</span>
						</div>
						<input name="" class="form-control" placeholder="Password"
							type="password" id="adminpassword" ng-model="adminpassword">


					</div>

					<!-- form-group// -->
					<div class="form-group">
						<button type="submit" class="btn btn-default">Login</button>
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

	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-resource.js"></script>
	<script src="<c:url value='/static/js/app.js' />"></script>
	<!--     <script src="<c:url value='/static/js/service/user_service.js' />"></script> -->
	<script
		src="<c:url value='/static/js/controller/user_controller.js' />"></script>



</body>
</html>



