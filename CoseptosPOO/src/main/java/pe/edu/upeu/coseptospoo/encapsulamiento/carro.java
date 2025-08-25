package pe.edu.upeu.coseptospoo.encapsulamiento;

public class carro extends vehiculo{
    String color= "negro";
    String modelo= "Supra";








    void caracteristicas(){
        marca="Toyota";
        System.out.println("---Este vehiculo tiene las siguientes caracteristicas---");
        System.out.println("Marca: "+marca); //HEREDA MARCA
        System.out.println("Modelo: "+modelo); //H
        System.out.println("Color: "+color);
        System.out.println("Y emite el siguiente sonido: " +sonido()); //HEREDA SONIDO

    }



    public static void main(String[] args) {
        carro carro = new carro();
        carro.caracteristicas();

    }
}