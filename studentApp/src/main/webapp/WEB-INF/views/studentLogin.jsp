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

<title>Student Form</title>
<!-- 
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
 -->
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>


</head>

<body ng-app="myApp" class="ng-cloak">
	<div class="card bg-light">
	<div  ng-controller="PostControllerLogin">

		<br>
		<p class="text-center">Student Fill-up Form</p>
		<hr>


		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">Login Account</h4>
				<p class="text-center">Get started with your account</p>
				
				<form ng-submit="submitForm()" name="myForm" action= "page2"> <!--FORM SUBMIT CONTROL  -->
					<div class="form-group input-group">
						<input type="hidden" id="studentid" ng-model="studentid">
					</div>
				
				
				<div class="form-group input-group">
					<div class="input-group-prepend">
  				<span class="input-group-text"><i class="fa fa-envelope"></i></span></div>
			    <input class="form-control" type="text" id="email" placeholder="Email address" ng-model="email">
				</div>
				<div class="form-group input-group">
				<div class="input-group-prepend">
  				<span class="input-group-text"><i class="fa fa-key fa-fw"></i></span></div>
  				<input class="form-control"  id="password" type="password" placeholder="Password" ng-model="password">
				</div> 
				
				<div class="form-group">
					<!-- <button type="submit" class="button button4" background-color="#4CAF50" color="white">login</button>-->
					<input type="submit" style=" background-color:green;color:white ;font-size:14px" value="Login"/>
				</div>
				</form>
				
				<p class="divider-text">
				<span class="bg-light">OR</span>
				</p>
				</article>
				</div>
				</div>

		<div  ng-controller="PostControllerRegister">

		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				
				
				<h4 class="card-title mt-3 text-center">Create Account</h4>
				<p class="text-center">Get started with your free account</p>
				
				
				<form ng-submit="submitForm1()" name="myForm"> <!--FORM SUBMIT CONTROL  -->
				
					<div class="form-group input-group">
						<input type="hidden" id="studentid" ng-model="studentid">
					</div>

					  <div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>
						<input name="" class="form-control" placeholder="Student Name"
							type="text" id="studentName" ng-model="studentName">
					</div> 
					
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-book"></i>
							</span>
						</div>
						<input name="" class="form-control" placeholder="Branch"
							type="text" id="branch" ng-model="branch">	
					</div>
					
					 <div class="form-group input-group">
					<div class="input-group-prepend">
  				<span class="input-group-text"><i class="fa fa-envelope"></i></span></div>
			    <input class="form-control" type="text" id="email" placeholder="Email address" ng-model="email">
				</div>
				
				 <div class="form-group input-group">
				<div class="input-group-prepend">
  				<span class="input-group-text"><i class="fa fa-key fa-fw"></i></span></div>
  				<input class="form-control" required ="" id="password" type="password" placeholder="Password" ng-model="password">
				</div>
				
				<!--  <div class="form-group input-group">
				<div class="input-group-prepend">
  				<span class="input-group-text"><i class="fa fa-key fa-fw"></i></span></div>
  				<input class="form-control"  id="confirmPassword" type="password" required ="" 
  				compare-to="password" placeholder="confirmPassword" ng-model="confirmpassword">
				<span id="passwords"></span>
				</div>-->
							
					<div class="form-group">
					<input type="submit" style=" background-color:green;color:white; font-size:14px" value="Register Here"/>
					
					</div>

				</form>
			</article>
		</div>
		<!-- card.// -->

	</div>
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
   <!--     <script src="<c:url value='/static/js/service/user_service.js' />"></script> -->
      <script src="<c:url value='/static/js/controller/user_controller.js' />"></script>



</body>
</html>



