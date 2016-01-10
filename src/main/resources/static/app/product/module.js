'use strict';

angular.module('app.product', [
    'ui.router',
    'ngResource'
])

.config(function ($stateProvider) {
    $stateProvider
        .state('app.product', {
            url: '/product',
            views: {
                "content@app": {
                    controller: 'DashboardCtrl',
                    templateUrl: 'app/product/product.ptl.html'
                }
            },
            data:{
                title: 'Product management'
            },
            resolve: {
                scripts: function(lazyScript){
                    return lazyScript.register([
                            'jquery-jvectormap-world-mill-en',
                            'flot-time',
                            'flot-resize'
                        ]);
                }
            }
        });
});
