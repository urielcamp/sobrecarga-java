public class Mago extends Personaje {

    //Atributo
    private int puntosDeMagia;

    //Constructor

    public Mago(String nombre, int puntosSalud, int puntosDeMagia){
        super(nombre, puntosSalud);
        this.puntosDeMagia = puntosDeMagia;
    }

    //Metodo
    public void lanzarHechizo(){
        System.out.println("El mago esta lanzando un hechizo");
    }


}
