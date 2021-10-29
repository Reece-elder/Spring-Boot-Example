# Controller

Controllers allow you to communicate with external apps (Postman or front end etc). 

They use HTTP methods with specified return values, to do certain things when certain HTTP requests are sent

GET
PUT
POST
DELETE
PATCH 

Requires use of @RestController above class

# Tutorial

Create a new class called demoController
@RestController above class
@GetMapping("/")
method{
    return "something"
}

Pasting this into the search will print some text
http://localhost:8080/hello

## Exercise 

Create 2 different methods that returns a string when you paste the mapping in the url

