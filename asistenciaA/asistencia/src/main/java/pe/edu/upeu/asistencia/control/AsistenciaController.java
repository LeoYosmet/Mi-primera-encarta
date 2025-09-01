package pe.edu.upeu.asistencia.control;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.modelo.Estudiante;
import pe.edu.upeu.asistencia.sevicio.EstudianteServicio;
import pe.edu.upeu.asistencia.sevicio.EstudianteServicioTmp;

@Controller
public class AsistenciaController {

    @Autowired
    public EstudianteServicioTmp estudianteServicioTmp;

    @FXML
    private Label idMsg;

    @FXML
    TextField txtDato;
    @Autowired
    private EstudianteServicio estudianteServicio;

    //@FXML
    //Button xDxxxxx;

    @FXML
    void enviar() {
        System.out.println("enviando asistencia");
        idMsg.setText(txtDato.getText());

    }

    @FXML
    void regEstudiante() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(new SimpleStringProperty(txtDato.getText()));
        estudiante.setEstado(new SimpleBooleanProperty(true));
        estudianteServicio.saveEntidad(estudiante);
        listarEstudiantes();
    }

    void listarEstudiantes() {
        for (Estudiante e: estudianteServicio.findAllEntidades()){
            System.out.println((e.getNombre()));
        }
    }


}