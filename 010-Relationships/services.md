@Service
public class IglooService {
	
	private IglooRepo repo;

	public IglooService(IglooRepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<Igloo> getAllIgloos(){
		return repo.findAll();
	}
	
	public Igloo createIgloo(Igloo igloo) {
		return repo.save(igloo);
	}

}