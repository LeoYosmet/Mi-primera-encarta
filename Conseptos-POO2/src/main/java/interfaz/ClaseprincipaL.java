package interfaz;

public class ClaseprincipaL {
    public static void main(String[] args) {
        Animal animal= new Loro();
        animal.emitirsonido();
        animal.dormir();

        animal=new Gato();
        animal.emitirsonido();
        animal.dormir();

    }
}
