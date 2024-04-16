public class Aguila extends Ave{

    //Atributos adicionales

    private double envergadura;

    //Constructor heredado

    public Aguila(String nombre, String color, double envergadura){
        super(nombre, color);
        this.envergadura = envergadura;
    }

    //Metodo adicional

    public void volarAlto(){
        System.out.println("El aguila esta volando a gran altura");
    }



}
