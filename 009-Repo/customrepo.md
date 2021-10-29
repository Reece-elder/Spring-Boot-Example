	List<Penguin> findByName(String name);
	// Auto generates SELECT * FROM penguin WHERE name = ?
	
	List<Penguin> findByAge(int age);
	// Auto generates SELECT * FROM penguin WHERE age = ?
	
	List<Penguin> findByAgeLessThan(int age); 
	// Auto generates SELECT * FROM penguin WHERE age <= ?