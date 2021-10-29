# Response Entity

Response entities are used to offer more info to the application sending a request

Each request gets back a response, either with useful object data or just with a status code to say "yep, heard ya!"

Response entites in Spring return the following:
- Status code (200, 404 etc)
- Content
- Access control

## Tutorial 

Convert createPenguin to return a Response Entity with a response of String 

## Exercise 

Convert your createObject method to return a responseEntity instead

## Second Tutorial

Convert getPenguin to return a response entity instead

## Exercise

Convert all other methods to return response entities

HTTPSTATUS.no_content
HTTPSTATUS.accepted
