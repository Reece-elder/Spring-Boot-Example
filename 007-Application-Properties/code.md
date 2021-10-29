# Specifies the server port to use
server.port = 8081 

# DB Connection details
# H2 - Locally running MySQL database
spring.datasource.url=jdbc:h2:mem:penguinDB
spring.datasource.username=sa
spring.datasource.password= 

# Enable H2 console to run
spring.h2.console.path=/h2-console
spring.h2.console.enabled=true

# Tells Spring to create tables automatically
# create-drop means the table will drop when the application stops running
# default for embedded databases (such as h2)
spring.jpa.hibernate.ddl-auto=create-drop
