# Advanced materials

Request mapping is more complex than that, allowing you to send and recieve objects pushing them or pulling them from the connected database and the front end

In order to send information to our project we need a front end.. or postman

Download postman NO NEED TO SIGN UP
https://www.postman.com/

## Tutorial

Create a basic entity class, inspo from the class
fields, constructor, getters and setters
Create method in controller
Set up postman http://localhost:8080/createPenguin
Body > Raw > Json

## Exercise

Create any object you want, create a method that takes in the data and adds it to a list
Use postman to push that data to your project
Modify the toString to system out more readbale info "Penguin <name> has been added to <list name>" 


## Tutorial for other methods

GET - Get info
PUT - Update info
DELETE - Delete info

Path Variable - Extracts values from the URL request was sent to
Checks for a variable name in the URL and inserts that value into the request string

Get / byId      - http://localhost:8080/get/2
GetAll
Delete / byId

## Exercise 

Add these methods
Add an update method using @PutMapping

Update / byId





