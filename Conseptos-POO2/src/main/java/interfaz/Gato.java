package interfaz;

public class Gato implements Animal {
    @Override
    public void emitirsonido(){
        System.out.println("Miaauuu...Miauuu");

    }

    @Override
    public void dormir(){
        System.out.println("Zzz...Zzzzz...");
    }
}
