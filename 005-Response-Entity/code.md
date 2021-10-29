# Response Entity code

@PostMapping("/createPenguin")
    public ResponseEntity<String> createPenguin(@RequestBody Penguin penguin){
        System.out.println(penguin);
        PenguinList.add(penguin);
        
        String stringResponse = "Penguin added!";
        
        Penguin responseBody = PenguinList.get(PenguinList.size() - 1);
        
        ResponseEntity<String> response = new ResponseEntity<String>(stringResponse, HttpStatus.CREATED);
        return response;
        
}


@GetMapping("/get/{index}")
    public ResponseEntity<Penguin> getPenguin(@PathVariable("index") int index) {
    
        Penguin penguinResponse = PenguinList.get(index);
        
        ResponseEntity<Penguin> response = new ResponseEntity<Penguin>(penguinResponse, HttpStatus.ACCEPTED);
        return response;
}