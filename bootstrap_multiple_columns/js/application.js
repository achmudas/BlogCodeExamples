 var readItApp = angular.module('columnsDemo', []);

 readItApp.controller('ColumnsCtrl', function($scope){
    $scope.persons = [
        {'name': 'John',
            'age': '35'},
        {'name': 'Peter',
            'age': '14'},
        {'name': 'Amanda',
            'age': '23'},
        {'name': 'Joseph',
            'age': '17'},
        {'name': 'Juliet',
            'age': '2'}
    ]
 });

