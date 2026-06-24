package POO.Unidad4.TareaInterfazVideo;


public class AppCampania {

    public static void main(String[] args) {
        PartidoDelBuenCodigo partido = new PartidoDelBuenCodigo();
        
        PalomaMensajera ave1 = new PalomaMensajera();
        PalomaMensajera ave2 = new PalomaMensajera();
        PalomaMensajera ave3 = new PalomaMensajera();
        TelefonoMovil telef1 = new TelefonoMovil();
        TelefonoMovil telef2 = new TelefonoMovil();
        TelefonoMovil telef3 = new TelefonoMovil();
        Persona pers1 = new Persona("Juan");
        Persona pers2 = new Persona("Matías");
        Persona pers3 = new Persona("Adolfo");
        
        

        partido.agregarMensajero(ave1);
        partido.agregarMensajero(ave2);
        partido.agregarMensajero(ave3);
        partido.agregarMensajero(telef1);
        partido.agregarMensajero(telef2);
        partido.agregarMensajero(telef3);
        partido.agregarMensajero(pers1);
        partido.agregarMensajero(pers2);
        partido.agregarMensajero(pers3);

        partido.hacerCampania();
        
    }


}
