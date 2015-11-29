 var readItApp = angular.module('columnsDemo', []);

 readItApp.controller('ColumnsCtrl', function($rootScope){ // TODO change later to the scope and store value from backend
    $rootScope.persons = [
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

