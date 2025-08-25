package interfaz;

public class Loro implements Animal {

    @Override
    public void emitirsonido(){
        System.out.println("Hola manito...");

    }

    @Override
    public void dormir(){
        System.out.println("Zzz...Zzzzz...");
    }
}
