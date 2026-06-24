package POO.Unidad4.Tarea2InterfazCaminar;

// Java implementation of the diagram as a child of Animal

public class Cat extends Animal implements pet {
    private String name;
    
    // Constructor with name parameter
    public Cat(String n) {
        super(4);
        this.name = n;
    }
    
    // Default constructor
    public Cat() {
        this("");
    }

    // Getter for name
    @Override
    public String getName() {
        return name;
    }
    
    @Override
        public void setName(String n) {
    name = n;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

    @Override
    public void eat() {
     System.out.println("Cats like to eat spiders and mice.");
    }
}