var exec = require('cordova/exec');

exports.show = function(message, duration, successCallback, errorCallback) {
    exec(successCallback, errorCallback, 'ToastPlugin', 'show', [message, duration]);
};
