public class Igloo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private int capacity;
	
	@OneToMany(mappedBy = "igloo") // An "igloo" contains "penguins" Is the Foreign Key
	private List<Penguin> penguins; // Set = A collecton / List with no duplicate elements

	public Igloo() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor without penguins (not every igloo requires penguins but can contain Penguins)
	public Igloo(long id, String name, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}