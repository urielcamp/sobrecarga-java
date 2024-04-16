public class Canario extends Ave{

    //Atributos agregados
    private String canto;




    //Constructor Heredado

    public Canario(String nombre, String color, String canto){
        super(nombre, color);
        this.canto = canto;
    }

    //Metodo

    public void cantar(){
        System.out.println(canto);
    }

}
