'use strict';

App.controller('PostController', ['$scope','$http','$location',function($scope, $http, $location) {
	$scope.submitForm = function(){
		var url = "postuser";
		
		var config = {
                headers : {
                    'Accept': 'application/json'
                }
        }
		var data = {
			studentid : $scope.studentid,
            studentName : $scope.studentName,
            branch : $scope.branch
        };
	
		$http.post(url, data, config).then(function (response) {
			$scope.postResultMessage = response.data;
		}, function (response) {
			alert(response.message);
		});
		
		$scope.studentid = "";
		$scope.studentName = "";
		$scope.branch = "";
	}
}]);
 
App.controller('GetController', ['$scope','$http','$location',function($scope, $http, $location) {
	$scope.getfunction = function(){
		var url = "getalluser";
		
		$http.get(url).then(function (response) {
			$scope.response = response.data
		}, function (response) {
			alert(response.message);
		});
	}
}]);

/*App.controller('UserController', ['$scope', 'User', function($scope, User) {
var self = this;
self.user= new User();

self.users=[];
    
self.fetchAllUsers = function(){
	  self.users = User.query();
};
 
self.createUser = function(){
	  self.user.$save(function(){
		  self.fetchAllUsers();
	  });
};

self.updateUser = function(){
	  self.user.$update(function(){
		  self.fetchAllUsers();
	  });
};

self.deleteUser = function(identity){
	 var user = User.get({id:identity}, function() {
		  user.$delete(function(){
			  console.log('Deleting user with id ', identity);
			  self.fetchAllUsers();
		  });
	 });
};

self.fetchAllUsers();

self.submit = function() {
    if(self.user.id==null){
        console.log('Saving New User', self.user);    
        self.createUser();
    }else{
		  console.log('Upddating user with id ', self.user.id);
        self.updateUser();
        console.log('User updated with id ', self.user.id);
    }
    self.reset();
};
    
self.edit = function(id){
    console.log('id to be edited', id);
    for(var i = 0; i < self.users.length; i++){
        if(self.users[i].id === id) {
           self.user = angular.copy(self.users[i]);
           break;
        }
    }
};
    
self.remove = function(id){
    console.log('id to be deleted', id);
    if(self.user.id === id) {//If it is the one shown on screen, reset screen
       self.reset();
    }
    self.deleteUser(id);
};


self.reset = function(){
    self.user= new User();
    $scope.myForm.$setPristine(); //reset Form
};

}]);
*/
//----------------------------------------------------------------------------------------//

