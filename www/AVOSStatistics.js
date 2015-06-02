var exec = require('cordova/exec');

window.AVOSStatistics = {
	exec: function(action, arg0, success, error){
		exec(success, error, "AVOSStatistics", action, [arg0]);
	},
	pageStart: function(pageName){
		var noop = function(){};
		window.AVOSStatistics.exec('pageStart', pageName, noop, noop);

		return function(){
			exec('pageEnd', pageName, noop, noop);
		};
	}
};

module.exports = window.AVOSStatistics;

