import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControleMenu {

    @FXML
    void iniciarButton(ActionEvent event) {
       Principal.changeScreenArvoreGenealogica(event);
    }

}

