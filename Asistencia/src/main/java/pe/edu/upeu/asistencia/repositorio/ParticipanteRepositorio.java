package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.enums.CARRERA;
import pe.edu.upeu.asistencia.enums.TIPO_PARTICIPANTE;
import pe.edu.upeu.asistencia.modelo.Participante;

import java.util.ArrayList;
import java.util.List;

public abstract class ParticipanteRepositorio {
   public List<Participante> listaParticipantes =new ArrayList<>();

   public List<Participante> findAll (){
      listaParticipantes.add(
              new Participante(
                      new SimpleStringProperty("76710643"),
                      new SimpleStringProperty("Leo"),
                      new SimpleStringProperty("Rz"),
                      new SimpleBooleanProperty(true), CARRERA.Sistemas, TIPO_PARTICIPANTE.Asistente
              )
      );
      listaParticipantes.add(
              new Participante(
                      new SimpleStringProperty("73647610"),
                      new SimpleStringProperty("Yosmet"),
                      new SimpleStringProperty("Pr"),
                      new SimpleBooleanProperty(true), CARRERA.Sistemas, TIPO_PARTICIPANTE.Asistente
              )
      );
      return listaParticipantes;
   }
}
