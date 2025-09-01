package pe.edu.upeu.asistencia.enums;

public enum CARRERA {

    Sistemas(FACULTAD.FIA),
    Civil(FACULTAD.FIA),
    Industrial(FACULTAD.FIA),
    General(FACULTAD.GENERAL),
    Contablilidad(FACULTAD.FCE ),
    Nutricion(FACULTAD.FCS),
    Educacion(FACULTAD.FACIHED);




    private FACULTAD facultad ;
    private CARRERA(FACULTAD facultad){
        this.facultad=facultad;
    }
    public FACULTAD getFacultad() {return facultad;}
    }

