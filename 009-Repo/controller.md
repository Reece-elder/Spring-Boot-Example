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