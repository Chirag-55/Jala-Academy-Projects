// 1. Event Listener to Display Current Date and Time
function displayDateTime() {
    var currentDate = new Date();
    console.log('Current Date and Time:', currentDate);
}

// 2. JavaScript Validation - Submit Button Click
function validateForm(textBoxValue) {
    if (textBoxValue.trim() === '') {
        console.log('Text box cannot be empty!');
        return false;
    }
    return true;
}

// 3. Console.log() for Debugging
function debugFunction() {
    var debugVar = 'Debugging variable';
    console.log('Debugging:', debugVar);
}

// 4. Functions to Set, Get, and Check Cookies
function setCookie(cookieName, cookieValue, expirationDays) {
    var expirationDate = new Date();
    expirationDate.setDate(expirationDate.getDate() + expirationDays);
    var cookieString = cookieName + '=' + encodeURIComponent(cookieValue) +
        '; expires=' + expirationDate.toUTCString() + '; path=/';
    document.cookie = cookieString;
}

function getCookie(cookieName) {
    var name = cookieName + '=';
    var decodedCookie = decodeURIComponent(document.cookie);
    var cookieArray = decodedCookie.split(';');
    for (var i = 0; i < cookieArray.length; i++) {
        var cookie = cookieArray[i].trim();
        if (cookie.indexOf(name) === 0) {
            return cookie.substring(name.length, cookie.length);
        }
    }
    return null;
}

function checkCookie(cookieName) {
    var cookieValue = getCookie(cookieName);
    if (cookieValue !== null) {
        console.log(cookieName + ' cookie exists with value: ' + cookieValue);
    } else {
        console.log(cookieName + ' cookie does not exist.');
    }
}

// 5. Create a JSON Object and Access it Using Dot Notation
var jsonObject = {
    name: 'John Doe',
    age: 25,
    city: 'Example City'
};

// Accessing JSON Object Using Dot Notation
console.log('Name:', jsonObject.name);
console.log('Age:', jsonObject.age);
console.log('City:', jsonObject.city);

// Examples
displayDateTime();
var isFormValid = validateForm('Sample Text');
console.log('Form Validation Result:', isFormValid);
debugFunction();
setCookie('exampleCookie', 'cookieValue', 7);
checkCookie('exampleCookie');
