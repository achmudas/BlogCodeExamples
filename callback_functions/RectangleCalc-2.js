var calculateArea = function (a,  b) {
	var area = a * b;
	console.log("Calculated area is equal to: " + area);
	return area;
}

var calculatePerimeter = function (a, b) {
	var perimeter = 2 * (a + b);
	console.log("Calculated perimeter is equal to: " + perimeter);
	return perimeter;
}

function rectangleCalculation(a, b, calculateFunction){
	console.log("Input parameters: a = " + a + "; b = " + b + ";");
	calculateFunction(a, b);
}

rectangleCalculation(5, 4, calculateArea);
rectangleCalculation(5, 4, calculatePerimeter);