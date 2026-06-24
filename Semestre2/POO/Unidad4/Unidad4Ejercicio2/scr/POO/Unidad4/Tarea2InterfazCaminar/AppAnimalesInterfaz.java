package POO.Unidad4.Tarea2InterfazCaminar;

public class AppAnimalesInterfaz {


    public static void main(String[] args) {
        Cat gato = new Cat("Dalí");
        Fish pez = new Fish();
        Spider arania = new Spider();

        //Darle un nombre al pez
        pez.setName("Rigoberto el dorado");


        //Ejecutar algunas funciones
        pez.eat();
        gato.play();
        arania.walk();
        gato.walk();
        pez.walk();
    }
}
