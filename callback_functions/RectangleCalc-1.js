var calculateArea = function (a,  b) {
	var area = a * b;
	console.log("Calculated area of "+ a + " and " + b + " is equal to: " + area);
	return area;
}

function rectangleCalculation(a, b, calculateFunction){
	calculateFunction(a, b);
}

rectangleCalculation(5, 4, calculateArea);