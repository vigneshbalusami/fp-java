(function(){
    var app = angular.module("demo",[]);
    app.controller("StoreController", function(){
        this.product = item;
    });
    var item = {
        name: "soap",
        price: 37.75,
        description: "lore Ipsum is simply dummy test",
        canPurchase : true

    };
})();