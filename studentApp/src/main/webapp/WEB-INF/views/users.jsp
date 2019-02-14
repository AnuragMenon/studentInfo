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

	<div  ng-controller="PostController">

		<br>
		<p class="text-center">Student Fill-up Form</p>
		<hr>


		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">Create Account</h4>
				<p class="text-center">Get started with your free account</p>
				<p>
					<a href="" class="btn btn-block btn-twitter"> <i
						class="fab fa-twitter"></i>   Login via Twitter
					</a> <a href="" class="btn btn-block btn-facebook"> <i
						class="fab fa-facebook-f"></i>   Login via facebook
					</a>
				</p>
				<p class="divider-text">
					<span class="bg-light">OR</span>
				</p>
				<form ng-submit="submitForm()" name="myForm"> <!--FORM SUBMIT CONTROL  -->
					<div class="form-group input-group">
						<input type="hidden" id="studentid" ng-model="studentid">
					</div>

					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>

						<input name="" class="form-control" placeholder="Student Name"
							type="text" id="studentName" ng-model="studentName">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-book"></i>
							</span>
						</div>
						<input name="" class="form-control" placeholder="Branch"
							type="text" id="branch" ng-model="branch">
							
						
						
					</div>

					<!-- form-group// -->
					<div class="form-group">
					<button type="submit" class="btn btn-default">Submit</button>
					<!-- 
							<input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                             <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
					 -->
					</div>
					<!-- form-group// -->
					
				<!--    	<a href="userManagement.jsp">Managing students list</a> --> 
					
				<!--  	<p class="text-center">
					<table class="table table-dark table-hover">
						<thead>
							<tr>
								<th>StudentId</th>
								<th>StudentName</th>
								<th>Branch</th>
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="u in ctrl.users">
								<td><span ng-bind="u.id"></span></td>
								<td><span ng-bind="u.username"></span></td>
								<td><span ng-bind="u.branch"></span></td>
								<td><button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Edit</button> </td>	
								<td><button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Remove</button></td>
							</tr>


						</tbody>


					</table>
					-->
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
   <!--     <script src="<c:url value='/static/js/service/user_service.js' />"></script> -->
      <script src="<c:url value='/static/js/controller/user_controller.js' />"></script>



</body>
</html>



