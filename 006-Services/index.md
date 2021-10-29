# Services

Service components are used for the 'business logic' of a Spring boot application.

Seperating out the arrayList methods from the controller class to the services class, so the controller is only interested in endpoints, with logic in this class

Requires the use of @Service above the class (similar to @RestController)

## Tutorial

Create a service class in a new package
Add Arraylist 
Add getByIndex method
Create newServices in controller method
Convert getByIndex to return the services method
codeFails.. why? 

Move createMethod to services as well

## Exercise

Convert create and get methods to use the services as well 