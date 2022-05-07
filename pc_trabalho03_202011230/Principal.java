/* ***************************************************************
* Autor............: Gustavo Pereira Nunes
* Matricula........: 202011230
* Inicio...........: 20/03/2022
* Ultima alteracao.: 27/03/2022
* Nome.............: Principal
* Funcao...........: O programa tem como funcionalidade a simulacao de trens em acao
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
    ControleGeral cG = new ControleGeral();
    ControleMenu cM = new ControleMenu();
    cenario.setTitle("Trem em acao");
    Parent fxmlTelaInicial = FXMLLoader.load(getClass().getResource("TelaInicial.fxml"));
    telaMenu = new Scene (fxmlTelaInicial);
    Parent fxmlTrem = FXMLLoader.load(getClass().getResource("TelaSecundaria.fxml"));
    telaPrograma = new Scene (fxmlTrem);

    cenario.setScene(telaMenu);
    cenario.show();
  }//Fim do metodo start

/* ***************************************************************
* Metodo: changeScreenTrem
* Funcao: trocar a tela inicial para a tela secundaria
* Parametros: ActionEvent event = evento que requer uma acao para ser executado, que no caso eh o de apertar um botao
* Retorno: void
*************************************************************** */
  public static void changeScreenTrem (ActionEvent event) {
      stage.setScene(telaPrograma);
  }//Fim do metodo changeScreenTrem
}//Fim da classe Principal
