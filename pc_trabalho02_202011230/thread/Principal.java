/* ***************************************************************
* Autor............: Gustavo Pereira Nunes
* Matricula........: 202011230
* Inicio...........: 07/03/2022
* Ultima alteracao.: 12/03/2022
* Nome.............: Arvore Genealogica
* Funcao...........: O programa basicamente funciona como uma arvore genealogica, exibindo desde o nascimento ate a morte do "pai"
*************************************************************** */
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application{
  private static Stage stage;
  private static Scene telaMenu;
  private static Scene telaPrograma;

/* ***************************************************************
* Metodo: main
* Funcao: lançar o programa
* Parametros: args=essencial para tornar o arquivo como principal
* Retorno: void
*************************************************************** */
  public static void main (String [] args) {
    launch (args);
  }//Fim do metodo main

/* ***************************************************************
* Metodo: start
* Funcao: Iniciar a exibição de telas
* Parametros: cenario=responsavel por permitir o uso de telas
* Retorno: void
*************************************************************** */
  @Override
  public void start (Stage cenario) throws IOException {
    stage = cenario;
    cenario.setTitle("Arvore genealogica");
    Parent fxmlMenu = FXMLLoader.load(getClass().getResource("telaInicial.fxml"));
    telaMenu = new Scene (fxmlMenu);
    Parent fxmlArvoreGenealogica = FXMLLoader.load(getClass().getResource("telaSecundaria.fxml"));
    telaPrograma = new Scene (fxmlArvoreGenealogica);

    cenario.setScene(telaMenu);
    cenario.show();
  }//Fim do metodo start

/* ***************************************************************
* Metodo: changeScreenArvoreGenealogica
* Funcao: trocar a tela presente para a tela menu
* Parametros: ActionEvent event = evento que requer uma acao para ser executado, que no caso eh ao apertar um botao
* Retorno: void
*************************************************************** */
  public static void changeScreenArvoreGenealogica (ActionEvent event) {
      stage.setScene(telaPrograma);
  }//Fim do metodo changeScreenArvoreGenealogica
}//Fim da classe Principal
