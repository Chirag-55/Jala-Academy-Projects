// 1. Single line and multiline comments
// Single line comment

/*
  Multiline comment
  This program demonstrates different JavaScript features.
*/

// 2. Array sorting on button click
var fruits = ['Apple', 'Banana', 'Orange', 'Grapes'];

function sortFruits() {
    fruits.sort().reverse(); // Sort in descending order
    console.log(fruits);
}

// 3. FOR/IN loop
var person = {
    firstname: 'John',
    lastname: 'Doe'
};

for (var key in person) {
    console.log(key + ': ' + person[key]);
}

// 4. Object properties access
var person = {
    firstname: 'John',
    lastname: 'Doe'
};

console.log(person.firstname); // Accessing using dot notation
console.log(person['lastname']); // Accessing using bracket notation

// 5. Variable hoisting
console.log(message); // Output: undefined
var message = 'Hello, World!'; // Variable is hoisted to the top

// 6. Strict mode and variable not declared error
'use strict';

try {
    undeclaredVariable = 'This will cause an error in strict mode';
} catch (error) {
    console.error(error.message);
}
