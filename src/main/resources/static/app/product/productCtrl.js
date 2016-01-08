'use strict';

angular.module('app.product').controller('productCtrl', function ($scope,$http) {
	$scope.produits = [{}];
	$http.get("/produit/lister/1")
	.success(function(data){
		$scope.produits=data;
		console.log(data);
	});
});