# Code

@PostMapping("/createPenguin")
    public String createPenguin(@RequestBody Penguin penguin){
        System.out.println(penguin);
        PenguinList.add(penguin);
        return penguin.toString();
        
}

# Request body

{
    "name" : "Penelope",
    "age" : 7,
    "happyFeet" : true
}

# Extended code

@GetMapping("/get/{index}")
    public String getPenguin(@PathVariable("index") int index) {
        Penguin penguin = PenguinList.get(index);
        return penguin.toString();
}

@GetMapping("/getAll")
public String getAll() {
    return PenguinList.toString();
}

@DeleteMapping("/delete/{index}")
public boolean deletePenguin(@PathVariable("index") int index) {
    PenguinList.remove(index);
    System.out.println("Penguin of index " + index + " has been deleted");
    return true;
    
}

@PutMapping("/update/{index}")
public String updatePenguin(@RequestBody Penguin penguin, @PathVariable("index") int index) {
    PenguinList.set(index, penguin);
    return penguin.toString();
}