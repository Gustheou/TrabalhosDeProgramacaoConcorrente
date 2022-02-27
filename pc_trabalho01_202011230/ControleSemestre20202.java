import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControleSemestre20202 {//Essa classe serve para definir o que ira proceder no semestre em questao.

  @FXML
  private ToggleGroup RadioButtonGroup;

  @FXML
  private RadioButton disciplinaProfessoresRadioButton;

  @FXML
  private RadioButton horariosRadioButton;

  @FXML
  private RadioButton notasFinaisRadioButton;

  @FXML
  private Label tipText;

/* ***************************************************************
* Metodo: continuarButton
* Funcao: Com uma das opcoes selecionada, realizar a alteracao de tela.
* Parametros: event = Botao que ao pressionado, desencadeara a funcao
* Retorno: void
*************************************************************** */
  @FXML
  void continuarButton(ActionEvent event) {
    if (horariosRadioButton.isSelected()) {//Esse if e os proximos else if servem para mudar a tela a depender de qual opcao selecionada.
      Principal.changeScreenTabelaHorario20202();
    } else if (disciplinaProfessoresRadioButton.isSelected()) {
      Principal.changeScreenProfessoresDisciplinas20202();
    } else if (notasFinaisRadioButton.isSelected()) {
      Principal.changeScreenNotasFinais20202();    
    } else {//Caso nenhuma opcao seja selecionada, ira exibir uma dica de como proceder.
      tipText.setVisible(true);
    }
  }

/* ***************************************************************
* Metodo: voltarButton
* Funcao: Retornar para o menu referente a escolha do semestre
* Parametros: event = Botao que ao pressionado, desencadeara a funcao
* Retorno: void
*************************************************************** */
  @FXML
  void voltarButton(ActionEvent event) {
    Principal.changeScreenMenu();
  }
}
