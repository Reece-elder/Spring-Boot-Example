	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increments
	private long id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@Column(unique = false, nullable = false)
	private int age;
	
	@Column(unique = false, nullable = false)
	private boolean happyFeet;