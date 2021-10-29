# Relationships

Single table databases are rare, generally tables will have some kind of relationship to each other:

many - many
one - one
one - many etc. 

In order to accomodate this we need to specify in the entity classes the relationships they have

Penguin table
Igloo table

Penguin has a Many to One relationship with Igloo
Igloo has a One to Many relationship with Penguin 

We need to create our other Entity and specify this info

## Tutorial

Create Igloo class with fields
Add OneToMany(mappedBy = "class name") above Set of penguins
Constructor WITHOUT penguins
Getters, setters and to string

Modify Penguin class, adding ManyToOne annotation
Igloo getters and setters for Penguin

Run and show new table on H2

## Exercise

Add a simple relationship to your project
Modify the code so on h2 console you can see the new tables 

NOTE - The tables are not actually connected yet


## Tutorial - Add Services and Controller to New Entity

Create:  
- Igloo Repo
- Igloo Service
- Igloo Controller

