import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControleNotasFinais20202 {

/* ***************************************************************
* Metodo: voltarButton
* Funcao: Retornar para o menu do semestre 2020.2
* Parametros: event = Botao que ao pressionado, desencadeara a funcao
* Retorno: void
*************************************************************** */
  @FXML
  void voltarButton(ActionEvent event) {
    Principal.changeScreenSemestre20202();
  }
}
