'use strict';

angular.module('app.dashboard').controller('produitCtrl', function ($scope,$http) {
	$scope.produits = [];
	$scope.nom="test";
	$http.get("/produit/lister/0/8")
	.success(function(data){
		$scope.produits=data.content;
		console.log(data);
	});
	$scope.getCategorie=function(categorieId){
		$http.get("/categorie/trouver/"+categorieId)
		.success(function(data){
			console.log(data.descriptionCategorie);
			return data.descriptionCategorie;
		});
	}
});