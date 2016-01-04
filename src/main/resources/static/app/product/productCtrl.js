'use strict';

angular.module('app.product').controller('productCtrl', function ($scope,$http) {
	$scope.produits = [{}];
	$http.get("/categorie/lister")
	.success(function(data){
		$scope.produits=data;
	});
});