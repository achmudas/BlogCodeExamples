var callDelayFunction = function(callbackFunction) {
	setTimeout(function() { 
		callbackFunction(); 
	}, 3000);
};


console.log("Starting");

callDelayFunction(function() {
	console.log("Callback function");
});

console.log("Ending");

