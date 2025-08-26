package pe.edu.upeu.conseptospoo2.enums;

enum GENERO{Masculino,Femenino}
enum NACIONALIDAD{Peruano,Colombiana,Canadienses}
enum CUMPLEAHOS{Enero,Febrero,Agosto,Octubre,Noviembre,Diciembre}



public class Persona {
   static String nombre;
    static GENERO genero = GENERO.Masculino;
    static NACIONALIDAD nacionalidad =  NACIONALIDAD.Peruano;
    static CUMPLEAHOS cumpleaños = CUMPLEAHOS.Diciembre;

    public static void main(String[] args) {
        nombre = "Leo";
        System.out.println(nombre + " es " + nacionalidad + " y es de genero " + genero + " .");

        for (GENERO xx: GENERO.values()) {
            System.out.println(xx);
        }
        for (NACIONALIDAD nacionalidad: NACIONALIDAD.values()) {
            System.out.println("Y le gusta de la nacionalidad " + " : " + nacionalidad);
        }
        for (CUMPLEAHOS cumpleahos : CUMPLEAHOS.values()) {
            System.out.println("Y los cumpleaños de su familia son en " + ": " + cumpleahos);
        }
    }
}
