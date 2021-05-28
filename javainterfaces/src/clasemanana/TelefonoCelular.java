package clasemanana;

public class TelefonoCelular extends Telefono implements Comunicador{

    @Override
    public void enviarmensaje(String mssg) {
        try{
            System.out.println("Hello Moto!");
            Thread.sleep(1000);
            System.out.println(mssg);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
