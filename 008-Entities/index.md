# Entities

Entities are classes that represent tables in a database
They produce objects which are rows in the database, use the same fields, constructors etc but added database functionality

Entities are annotated with @Entity
and must have atleast one @Id field.

Overloading useful for entities, one constructor WITH an id and one WITHOUT

@Column can be added to further specify the variable names
converted from camelCase to snake_case for MySQL readability

## Tutorial

Convert Penguin -> Entity
javax.persistence for imports

## Exercise

Convert Object to entity


## Tutorial

Go through H2 console now containing your table
Push something through postman, ask why its not showing up here