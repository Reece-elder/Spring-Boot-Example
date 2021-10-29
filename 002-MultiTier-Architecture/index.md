# Multi Tier Architecture

Process of splitting up major components of an application into different environments. 
- If one part breaks only that part breaks (not the entire app)

1) Database running on a dedicated Cloud DB RDS etc
2) Back end running on cloud based VMs
3) Front end deployed to other cloud based vms, or container systsms

Three Tier Architecture

Presentation Layer 
Business Layer
Persistence / Data Layer


Backend - Multi Tier Architecture

Controller - Talks to the front end, creates the REST API
DTOs Data Transfer Objects - Used to combine entities together for data post and retrieval
Entities - The model to create objects out of
Services - Business layer, doing the operations
JPA Repository - Similar to JDBC, allows you to pass info to a database

Database - stores data