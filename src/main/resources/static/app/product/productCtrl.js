'use strict';

angular.module('app.product').controller('productCtrl', function ($scope,$http) {
	$scope.produits = [{}];
	$http.get("/produit/trouver/11")
	.success(function(data){
		$scope.produits=data;
		console.log(data.categorie.codeCategorieProduit);
	});
});