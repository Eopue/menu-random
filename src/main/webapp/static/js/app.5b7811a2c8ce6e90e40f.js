webpackJsonp([1], [, , , , , , , , , function (t, e, s) {
    "use strict";
    var i = s(2), a = s(43), n = s(40), c = s.n(n);
    i.a.use(a.a), e.a = new a.a({routes: [{path: "/", name: "menu", component: c.a}]})
}, function (t, e) {
}, function (t, e, s) {
    function i(t) {
        s(34)
    }

    var a = s(8)(s(30), s(42), i, null, null);
    t.exports = a.exports
}, , , , , , , , , , , , , , , , , , , function (t, e, s) {
    "use strict";
    Object.defineProperty(e, "__esModule", {value: !0}), e.default = {name: "app"}
}, function (t, e, s) {
    "use strict";
    Object.defineProperty(e, "__esModule", {value: !0});
    var i = s(12), a = s.n(i);
    e.default = {
        data: function () {
            return {foods: [], num: ""}
        }, created: function () {
        }, computed: {
            totalPrice: function () {
                for (var t = 0, e = 0; e < this.foods.length; e++)t += this.foods[e].price;
                return t
            }
        }, methods: {
            submit: function () {
                var t = this;
                a.a.get("/menu/index?num=" + this.num).then(function (e) {
                    console.log(e), t.foods = e.data.data
                }).catch(function (t) {
                    console.log(t)
                })
            }
        }
    }
}, function (t, e, s) {
    "use strict";
    Object.defineProperty(e, "__esModule", {value: !0});
    var i = s(2), a = s(11), n = s.n(a), c = s(9), o = s(10);
    s.n(o);
    i.a.config.productionTip = !1, new i.a({el: "#app", router: c.a, template: "<App/>", components: {App: n.a}})
}, function (t, e) {
}, function (t, e) {
}, , , function (t, e, s) {
    t.exports = s.p + "static/img/food-icon-one.86e5bde.jpg"
}, function (t, e, s) {
    t.exports = s.p + "static/img/food-icon-three.e7c96fa.jpg"
}, function (t, e, s) {
    t.exports = s.p + "static/img/food-icon-two.9ae9ac5.jpg"
}, function (t, e, s) {
    function i(t) {
        s(33)
    }

    var a = s(8)(s(31), s(41), i, null, null);
    t.exports = a.exports
}, function (t, e, s) {
    t.exports = {
        render: function () {
            var t = this, e = t.$createElement, s = t._self._c || e;
            return s("div", {staticClass: "menu"}, [s("div", {staticClass: "menu-part menu-list"}, [s("div", {staticClass: "menu-title"}, [s("h1", [t._v("Breakfast")]), t._v(" "), s("input", {
                directives: [{
                    name: "model",
                    rawName: "v-model.number",
                    value: t.num,
                    expression: "num",
                    modifiers: {number: !0}
                }],
                attrs: {type: "number", placeholder: "Num of dishes"},
                domProps: {value: t.num},
                on: {
                    keydown: function (e) {
                        if (!("button" in e) && t._k(e.keyCode, "enter", 13))return null;
                        t.submit(e)
                    }, input: function (e) {
                        e.target.composing || (t.num = t._n(e.target.value))
                    }, blur: function (e) {
                        t.$forceUpdate()
                    }
                }
            })]), t._v(" "), t._m(0)]), t._v(" "), s("div", {staticClass: "menu-part menu-order"}, [t._m(1), t._v(" "), t.foods.length > 0 ? s("ul", t._l(t.foods, function (e, i) {
                return s("li", {staticClass: "order-item"}, [t._v(t._s(i + 1) + "️ 、 " + t._s(e.name) + " $" + t._s(e.price) + " "), s("i", {staticClass: "icon-reduce"})])
            })) : t._e(), t._v(" "), 0 === t.foods.length ? s("div", {staticClass: "none-food"}, [t._v("...")]) : t._e(), t._v(" "), s("div", {staticClass: "total"}, [t._v("Total"), s("span", {staticClass: "total-detail"}, [t._v("$" + t._s(t.totalPrice))])]), t._v(" "), s("button", [t._v("Checkout")])])])
        }, staticRenderFns: [function () {
            var t = this, e = t.$createElement, i = t._self._c || e;
            return i("ul", [i("li", {staticClass: "food-item"}, [i("div", {staticClass: "icon"}, [i("img", {
                attrs: {
                    src: s(37),
                    width: "209",
                    height: "156",
                    alt: ""
                }
            })]), t._v(" "), i("div", {staticClass: "content"}, [i("div", {staticClass: "name"}, [t._v("Breakfast1")]), t._v(" "), i("div", {staticClass: "old-price"}, [t._v("$7.50")]), t._v(" "), i("div", {staticClass: "desc"}, [t._v("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidicunt ut labore et tumagna aliqua")]), t._v(" "), i("div", {staticClass: "price"}, [t._v("Delivery cost: "), i("span", {staticClass: "price-detail"}, [t._v("$2.50")])]), t._v(" "), i("div", {staticClass: "cartcontrol-add"}, [t._v("Add to Order")])])]), t._v(" "), i("li", {staticClass: "food-item"}, [i("div", {staticClass: "icon"}, [i("img", {
                attrs: {
                    src: s(39),
                    width: "209",
                    height: "156",
                    alt: ""
                }
            })]), t._v(" "), i("div", {staticClass: "content"}, [i("div", {staticClass: "name"}, [t._v("Breakfast2")]), t._v(" "), i("div", {staticClass: "old-price"}, [t._v("$12.00")]), t._v(" "), i("div", {staticClass: "desc"}, [t._v("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidicunt ut labore et tumagna aliqua")]), t._v(" "), i("div", {staticClass: "price"}, [t._v("Delivery cost: "), i("span", {staticClass: "price-detail"}, [t._v("Free")])]), t._v(" "), i("div", {staticClass: "cartcontrol-add"}, [t._v("Add to Order")])])]), t._v(" "), i("li", {staticClass: "food-item"}, [i("div", {staticClass: "icon"}, [i("img", {
                attrs: {
                    src: s(38),
                    width: "209",
                    height: "156",
                    alt: ""
                }
            })]), t._v(" "), i("div", {staticClass: "content"}, [i("div", {staticClass: "name"}, [t._v("Breakfast3")]), t._v(" "), i("div", {staticClass: "old-price"}, [t._v("$15.00")]), t._v(" "), i("div", {staticClass: "desc"}, [t._v("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incidicunt ut labore et tumagna aliqua")]), t._v(" "), i("div", {staticClass: "price"}, [t._v("Delivery cost: "), i("span", {staticClass: "price-detail"}, [t._v("Free")])]), t._v(" "), i("div", {staticClass: "cartcontrol-add"}, [t._v("Add to Order")])])])])
        }, function () {
            var t = this, e = t.$createElement, s = t._self._c || e;
            return s("div", {staticClass: "order-title"}, [s("i", {staticClass: "icon-order"}), t._v(" "), s("span", [t._v("\n      Your Order\n      ")])])
        }]
    }
}, function (t, e) {
    t.exports = {
        render: function () {
            var t = this, e = t.$createElement, s = t._self._c || e;
            return s("div", {attrs: {id: "app"}}, [t._m(0), t._v(" "), s("router-view")], 1)
        }, staticRenderFns: [function () {
            var t = this, e = t.$createElement, s = t._self._c || e;
            return s("div", {staticClass: "menu-wrapper"}, [s("div", {staticClass: "menu-parts"}, [s("h1", {staticClass: "part-title menu-part-item"}, [s("i", {staticClass: "icon-menu"}), t._v(" "), s("span", [t._v("\n        MENU\n        ")])]), t._v(" "), s("ul", [s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "active menu-item-content"}, [t._v("\n            Breakfast\n          ")])]), t._v(" "), s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "menu-item-content"}, [t._v("\n            lunch\n          ")])]), t._v(" "), s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "menu-item-content"}, [t._v("\n            Dinner\n          ")])]), t._v(" "), s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "menu-item-content"}, [t._v("\n            Deserts\n          ")])])])]), t._v(" "), s("div", {staticClass: "menu-parts"}, [s("div", {staticClass: "filter-part menu-part-item"}, [s("h1", {staticClass: "part-title"}, [s("i", {staticClass: "icon-filter"}), t._v(" "), s("span", [t._v("\n        FILTER BY\n      ")])]), t._v(" "), s("ul", [s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "active menu-item-content"}, [t._v("\n              Healthy\n            ")])]), t._v(" "), s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "menu-item-content"}, [t._v("\n              Halal\n            ")])]), t._v(" "), s("li", {staticClass: "menu-item"}, [s("div", {staticClass: "menu-item-content"}, [t._v("\n              Beef\n            ")])])])])])])
        }]
    }
}], [32]);
//# sourceMappingURL=app.5b7811a2c8ce6e90e40f.js.map