'use strict';

angular.module('app.appViews').controller('ProjectsDemoCtrl', function ($scope, projects) {

    //$scope.projects = projects.data;
	$scope.projects = projects;

    $scope.tableOptions =  {
        "data": projects.data,
//            "bDestroy": true,
        "iDisplayLength": 15,
        "columns": [
            {
                "class":          'details-control',
                "orderable":      false,
                "data":           null,
                "defaultContent": ''
            },
            { "data": "produitId" },
            { "data": "codeProduit" },
            { "data": "descriptionProduit" },
            { "data": "prixUnitaireProduit" },
            { "data": "prixUnitaireMarge" },
            { "data": "categorieId" },
            { "data": "produitTaxable" },
            { "data": "suiviEnStock" }
        ],
        "order": [[1, 'asc']]
    }
});