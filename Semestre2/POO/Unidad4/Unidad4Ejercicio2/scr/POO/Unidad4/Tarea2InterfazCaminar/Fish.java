package POO.Unidad4.Tarea2InterfazCaminar;

public class Fish extends Animal implements pet {
    private String name;

    // Default constructor
    public Fish() {
        super(0);
    }

    // Getter for name
    @Override
    public String getName() {
        return this.name;
    }

    // Setter for name
    
    @Override
    public void setName(String n) {
        this.name = n;
    }

    // play method
    @Override
    public void play() {
        System.out.println("Fish swim in their tanks all day.");
 }

    // walk method
    @Override
    public void walk() {
        super.walk();
        System.out.println("Fish, of course, can’t walk; they swim.");
    }

    // eat method
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }
}