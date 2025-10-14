package pe.edu.upeu.sysventas.service;

import javafx.scene.control.ComboBox;
import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.Categoria;

import java.util.List;

public interface ICategoriaService extends ICrudGenericoService<Categoria,Long> {
    public List<ComboBoxOption> listarCombobox();

}
