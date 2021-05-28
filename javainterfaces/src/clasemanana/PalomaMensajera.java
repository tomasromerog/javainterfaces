package clasemanana;

public class PalomaMensajera extends Paloma implements Comunicador{

    @Override
    public void enviarmensaje(String mssg) {
        try{
            System.out.println("Soy la paloma, emprendo vuelo");
            Thread.sleep(1000);
            System.out.println("Aterrice, aca esta el mensaje: " + mssg);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
