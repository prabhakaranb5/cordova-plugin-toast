"use strict";

var exec = require("cordova/exec");

var simpleToastPlugin = {
	show: function(txt, duration, sc, ec) {
		exec(sc, ec, "Toast", "show", [txt, duration]);
	}
};

module.exports = Toast;
