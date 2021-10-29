private ServicesDB penguinService;

public ControllerDemo(ServicesDB penguinService) {
    super();
    this.penguinService = penguinService;
}

    @PostMapping("/createPenguin")
    public ResponseEntity<String> createPenguin(@RequestBody Penguin penguin){
//			System.out.println(penguin);
//			PenguinList.add(penguin);
    System.out.println("pre service");
        penguinService.createPenguin(penguin);
        
        String stringResponse = "Penguin added!";
        
//			Penguin responseBody = PenguinList.get(PenguinList.size() - 1);
        
        ResponseEntity<String> response = new ResponseEntity<String>(stringResponse, HttpStatus.CREATED);
        return response;
        
}


### Newer Code

@GetMapping("/get/{index}")
    public ResponseEntity<Penguin> getPenguin(@PathVariable("index") int index) {
    
        Penguin penguinResponse = penguinService.getPenguinId(index);
        
        ResponseEntity<Penguin> response = new ResponseEntity<Penguin>(penguinResponse, HttpStatus.ACCEPTED);
        return response;
}

@GetMapping("/getAll")
public List<Penguin> getAll() {
    return penguinService.getAllPenguins();
}

@DeleteMapping("/delete/{index}")
public ResponseEntity<String> deletePenguin(@PathVariable("index") int index) {
    penguinService.deletePenguin(index);
    String responseString = "Penguin of index " + index + " has been deleted";
    System.out.println(responseString);
    ResponseEntity<String> response = new ResponseEntity<String>(responseString, HttpStatus.NO_CONTENT);
    return response;
}

@PutMapping("/update/{index}")
public ResponseEntity<Penguin> updatePenguin(@RequestBody Penguin penguin, @PathVariable("index") int index) {
//		PenguinList.set(index, penguin);
//		
//		Penguin responseBody = PenguinList.get(PenguinList.size() - 1);
    
    Penguin responseBody = penguinService.updatePenguin(penguin, index);
    
    ResponseEntity<Penguin> response = new ResponseEntity<Penguin>(responseBody, HttpStatus.CREATED);
    return response;
    
}