"use strict";

var exec = require("cordova/exec");

var ToastPlugin = {
	show: function(message, duration, successCallback, errorCallback) {
    		exec(successCallback, errorCallback, 'ToastPlugin', 'show', [message, duration]);
	}
};

module.exports = ToastPlugin;
