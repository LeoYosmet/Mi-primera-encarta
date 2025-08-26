package pe.edu.upeu.conseptospoo2.claseinterna;

public class ClaseExterna {
    int a, b;

    int operacion(){
        return a+b;
    }

    class interna1{
        int r;
        void mensaje(){
            r=(a+b);
            System.out.println("La operacion de suma es: " + r );
        }
    }

    class interna2{
        void otraoperacion(){
            System.out.println("La operacion de resta es: " + (a-b));

        }

    }

    class interna3{
        void otraoperacion2(){
            System.out.println("La operacion de multiplicaicion es: " + (a*b));
        }
    }

    class interna4{
        void otraoperacion3(){
            System.out.println("La operacion de division es: " + (a/b));


            System.out.println("---Y en la siguinete pregunta a CHAT GPT---");
        }
    }

    public static void main(String[] args) {
        ClaseExterna clase = new ClaseExterna();
        clase.a=7;
        clase.b=10;


        interna1 ci1= clase.new interna1();
        ci1.mensaje();
        interna2 ci2= clase.new interna2();
        ci2.otraoperacion();
        interna3 ci3= clase.new interna3();
        ci3.otraoperacion2();
        interna4 ci4= clase.new interna4();
        ci4.otraoperacion3();

    }







}
