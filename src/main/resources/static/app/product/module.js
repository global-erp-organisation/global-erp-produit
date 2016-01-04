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
                    controller: 'productCtrl',
                    templateUrl: 'app/product/product.tpl.html'
                }
            },
            data:{
                title: 'product'
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
