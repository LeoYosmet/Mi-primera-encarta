package pe.edu.upeu.conseptospoo2.abstrcpolimorfismo;

public class Lobo extends  Animal{
    @Override
    public void sonidoAnimal() {
        System.out.println("¡auuu! ¡auuu!");

    }

    public void dormir (){
        System.out.println("Estoy mimiendo...Zzzz");
    }
}
