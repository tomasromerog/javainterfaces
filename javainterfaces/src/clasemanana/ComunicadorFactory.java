package clasemanana;

public abstract class ComunicadorFactory {

    private static Comunicador instancia = null;

    public static Comunicador crearInstancia(){
        //Generamos esto para que tengamos mtodo en la misma instancia y no en distintos momentos
        if( instancia == null){
            instancia = new TelefonoCelular();
        }
        return instancia;
        /*return new PalomaMensajera();*/
//        return new TelefonoCelular();
    }
}
