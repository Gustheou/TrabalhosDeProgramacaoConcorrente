import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControleHorario20211 {

/* ***************************************************************
* Metodo: voltarButton
* Funcao: Retornar para o menu do semestre 2021.1.
* Parametros: event = Botao que ao pressionado, desencadeara a funcao
* Retorno: void
*************************************************************** */
  @FXML
  void voltarButton(ActionEvent event) {
    Principal.changeScreenSemestre20211();
  }
}
