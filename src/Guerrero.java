public class Guerrero extends Personaje {

    //Atributos
    private int puntosAtaque;

    //Constructor

    public Guerrero(String nombre, int puntosSalud, int puntosAtaque){
        super(nombre, puntosSalud);
        this.puntosAtaque = puntosAtaque;
    }

    //Metodo

    public void atacar(){
        System.out.println("El guerrero esta atacando");
    }
}
