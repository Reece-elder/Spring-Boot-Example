@Service
@Primary // If multiple beans of a type exist (service etc.) Primary indicates use this bean
public class ServicesDB {

private PenguinRepo repo;

// Spring creates objects of all beans, by specifying the constructor here with a repo, it will assign it this repo
public ServicesDB(PenguinRepo repo) {
    super();
    this.repo = repo;
}

// Use List rather than arrayList
public List<Penguin> getAllPenguins(){
    // SELECT * FROM penguin
    return repo.findAll();
}

public Penguin createPenguin(Penguin penguin) {
    System.out.println("Penguin added through DB");
    return repo.save(penguin);
}

## Newer code

public Penguin getPenguinId(long id) {
    return this.repo.findById(id).get();
}

public boolean deletePenguin(long id) {
    repo.deleteById(id);
    return true;
}


// Update method
public Penguin updatePenguin(Penguin penguin, long id) {
    
    Penguin oldPenguin = repo.findById(id).get();
    
    oldPenguin.setName(penguin.getName());
    oldPenguin.setAge(penguin.getAge());
    oldPenguin.setHappyFeet(penguin.isHappyFeet());
    
    Penguin newPenguin = oldPenguin;
    repo.save(newPenguin);
    return newPenguin;
    
}

	
