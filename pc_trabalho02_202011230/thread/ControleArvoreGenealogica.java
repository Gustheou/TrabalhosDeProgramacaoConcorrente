import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.util.Timer;
import java.util.TimerTask;

public class ControleArvoreGenealogica {
  
  @FXML
  public ImageView imagemFilho3Mirin;

  @FXML
  public ImageView imagemNeto2Morre;

  @FXML
  public ImageView imagemFilho3Adulto;

  @FXML
  public ImageView imagemPaiIdoso;

  @FXML
  public ImageView imagemBisneto1Jovem;

  @FXML
  public ImageView imagemFilho1Adulto;

  @FXML
  public ImageView imagemPaiAdulto;

  @FXML
  public TextField textFieldFilho3;

  @FXML
  public ImageView imagemPaiIdosoMorre;

  @FXML
  public ImageView imageArvore;

  @FXML
  public ImageView imagemFilho2Jovem;

  @FXML
  public ImageView imagemFilho2Idoso;

  @FXML
  public ImageView imagemFilho3Idoso;

  @FXML
  public ImageView imagemPaiJovem;

  @FXML
  public ImageView imagemFilho1Mirin;

  @FXML
  public ImageView imagemNeto1Jovem;

  @FXML
  public ImageView imagemNeto1Morre;

  @FXML
  public TextField textFieldFilho1;

  @FXML
  public TextField textFieldFilho2;

  @FXML
  public ImageView imagemFilho2IdosoMorre;

  @FXML
  public TextField textFieldBisneto1;

  @FXML
  public ImageView imagemBisneto1Morre;

  @FXML
  public ImageView imagemNeto2Mirin;

  @FXML
  public ImageView imagemFilho3Jovem;

  @FXML
  public ImageView ImageBisneto1Mirin;

  @FXML
  public ImageView imagemNeto2Adulto;

  @FXML
  public ImageView imagemNeto2Jovem;

  @FXML
  public TextField textFieldNeto2;

  @FXML
  public TextField textFieldNeto1;

  @FXML
  public TextField textFieldPai;

  @FXML
  public Button buttonIniciar;

  @FXML
  public ImageView imagemFilho1IdosoMorre;

  @FXML
  public ImageView imagemFilho2Adulto;

  @FXML
  public ImageView imagemNeto1Mirin;

  @FXML
  public ImageView imagemPaiMirin;

  @FXML
  public ImageView imagemFilho1Jovem;

  @FXML
  public ImageView imagemFundo2;

  @FXML
  public ImageView imagemFilho2Mirin;

  @FXML
  public ImageView imagemFundo1;

  @FXML
  public ImageView imagemFilho3IdosoMorre;

  @FXML
  public ImageView imagemNeto1Adulto;

  @FXML
  public ImageView imagemFilho1Idoso;

  @FXML
  void buttonIniciar(ActionEvent event) throws InterruptedException {
    buttonIniciar.setVisible(false);
   
    ProcessoNasceOPai pNP = new ProcessoNasceOPai();
    ProcessoNasceOPrimeiroFilho pNPF = new ProcessoNasceOPrimeiroFilho();
    ProcessoNasceOSegundoFilho pNSF = new ProcessoNasceOSegundoFilho();
    ProcessoNasceOTerceiroFilho pNTF = new ProcessoNasceOTerceiroFilho();
    ProcessoPaiEhAvoDoPrimeiroFilho pPAPF = new ProcessoPaiEhAvoDoPrimeiroFilho();
    ProcessoPaiEhAvoDoSegundoFilho pPASF = new ProcessoPaiEhAvoDoSegundoFilho();
    ProcessoPaiEhBisavoDoPrimeiroFilho pPBPF = new ProcessoPaiEhBisavoDoPrimeiroFilho();
    ProcessoPrimeiroFilhoMorre pPFM = new ProcessoPrimeiroFilhoMorre();
    ProcessoSegundoFilhoMorre pSFM = new ProcessoSegundoFilhoMorre();
    ProcessoTerceiroFilhoMorre pTFM = new ProcessoTerceiroFilhoMorre();
    ProcessoPrimeiroNetoMorre pPNM = new ProcessoPrimeiroNetoMorre();
    ProcessoSegundoNetoMorre pSNF = new ProcessoSegundoNetoMorre();
    ProcessoBisnetoMorre pBNF = new ProcessoBisnetoMorre();
    ProcessoPaiMorre pPM = new ProcessoPaiMorre();
    
    
    FadeTransition ft = new FadeTransition(Duration.millis(800), imageArvore);
    imageArvore.setVisible(true);
    ft.setFromValue(0.0);
    ft.setToValue(1.0);
    ft.play();

    pNP.start();
    pNPF.start();
    pNSF.start();
    pNTF.start();
    pPAPF.start();
    pPASF.start();
    pPBPF.start();
    pPFM.start();
    pSFM.start();
    pTFM.start();
    pPNM.start();
    pSNF.start();
    pBNF.start();
    pPM.start();
  }

  public class ProcessoNasceOPai extends Thread {
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 0;
      temporizador.schedule(nasceOPai, tempo);
    }
    TimerTask nasceOPai = new TimerTask() {
      @Override
      public void run () {
        FadeTransition ft = new FadeTransition(Duration.millis(600), imagemPaiMirin);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        textFieldPai.setVisible(true);
        imagemPaiMirin.setVisible(true);
        textFieldPai.setText("Nasce o pai");

        System.out.println("O pai nasce");
      }
    };
  }

  public class ProcessoNasceOPrimeiroFilho extends Thread{
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 22*1000;
      temporizador.schedule(nasceOPrimeiroFilho,tempo);
    }

    TimerTask nasceOPrimeiroFilho = new TimerTask(){
      @Override
      public void run () {
      imagemPaiAdulto.setVisible(true);
      FadeTransition ft = new FadeTransition(Duration.millis(600), imagemPaiAdulto);
      ft.setFromValue(0.0);
      ft.setToValue(1.0);
      ft.play();
      imagemPaiMirin.setVisible(false);
      textFieldPai.setVisible(false);
      textFieldPai.setText("");

      textFieldFilho1.setVisible(true);
      textFieldFilho1.setText("Filho 1 nasce");
      imagemFilho1Mirin.setVisible(true);

      System.out.println("O pai tem o primeiro filho aos 22 anos de idade");
      } 
    }; 
  }

  public class ProcessoNasceOSegundoFilho extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 25*1000;
      temporizador.schedule(nasceOSegundoFilho,tempo);
    }

    TimerTask nasceOSegundoFilho = new TimerTask(){
      @Override
      public void run () {
        textFieldFilho2.setVisible(true);
        textFieldFilho2.setText("Filho 2 nasce");
        imagemFilho2Mirin.setVisible(true);

        System.out.println("O pai tem o segundo filho aos 25 anos de idade");
      }
    };
  }

  public class ProcessoNasceOTerceiroFilho extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 32*1000;
      temporizador.schedule(nasceOTerceiroFilho,tempo);
    }

    TimerTask nasceOTerceiroFilho = new TimerTask(){
      @Override
      public void run () {
        textFieldFilho1.setVisible(false);
        textFieldFilho1.setText("");

        textFieldFilho2.setVisible(false);
        textFieldFilho2.setText("");

        textFieldFilho3.setVisible(true);
        textFieldFilho3.setText("Filho 3 nasce");
        imagemFilho3Mirin.setVisible(true);

        System.out.println("O pai tem o terceiro filho aos 32 anos de idade");
      }
    };
  }

  public class ProcessoPaiEhAvoDoPrimeiroFilho extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 38*1000;
      temporizador.schedule(paiEhAvoDoPrimeiroFilho, tempo);
    }
    TimerTask paiEhAvoDoPrimeiroFilho = new TimerTask() {
      @Override
      public void run () {
        textFieldFilho3.setVisible(false);
        textFieldFilho3.setText("");

        imagemFilho1Mirin.setVisible(false);
        imagemFilho1Jovem.setVisible(true);

        imagemFilho2Mirin.setVisible(false);
        imagemFilho2Jovem.setVisible(true);

        textFieldNeto1.setVisible(true);
        textFieldNeto1.setText("Neto 1 nasce");
        imagemNeto1Mirin.setVisible(true);

        System.out.println("O pai eh avo (primeiro filho) aos 38 anos de idade");
      }
    };
  }

  public class ProcessoPaiEhAvoDoSegundoFilho extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 45*1000;
      temporizador.schedule(paiEhAvoDoSegundoFilho, tempo);
    }
    TimerTask paiEhAvoDoSegundoFilho = new TimerTask() {
      @Override
      public void run () {
        textFieldNeto1.setVisible(false);
        textFieldNeto1.setText("");

        imagemFilho3Mirin.setVisible(false);
        imagemFilho3Jovem.setVisible(true);

        textFieldNeto2.setVisible(true);
        textFieldNeto2.setText("Neto 2 nasce");
        imagemNeto2Mirin.setVisible(true);

        System.out.println("O pai eh avo (segundo filho) aos 45 anos de idade");
      }
    };
  }

  public class ProcessoPaiEhBisavoDoPrimeiroFilho extends Thread{
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 68*1000;
      temporizador.schedule(paiEhBisavoDoPrimeiroFilho,tempo);
    }
    TimerTask paiEhBisavoDoPrimeiroFilho = new TimerTask() {
      @Override
      public void run () {
        imagemPaiAdulto.setVisible(false);
        imagemPaiIdoso.setVisible(true);

        imagemFilho1Jovem.setVisible(false);
        imagemFilho1Adulto.setVisible(true);

        imagemFilho2Jovem.setVisible(false);
        imagemFilho2Adulto.setVisible(true);

        imagemNeto2Mirin.setVisible(false);
        imagemNeto2Jovem.setVisible(true);
        textFieldNeto2.setVisible(false);
        textFieldNeto2.setText("");

        imagemNeto1Mirin.setVisible(false);
        imagemNeto1Jovem.setVisible(false);
        imagemNeto1Adulto.setVisible(true);

        textFieldBisneto1.setVisible(true);
        ImageBisneto1Mirin.setVisible(true);
        textFieldBisneto1.setText("Bisneto 1 nasce");

        System.out.println("O pai eh bisavo (primeiro filho) aos 68 anos de idade");
      }
    };
  }

  public class ProcessoPrimeiroFilhoMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 83*1000;
      temporizador.schedule(primeiroFilhoMorre, tempo);
    }
    TimerTask primeiroFilhoMorre = new TimerTask() {
      @Override
      public void run () {
        imagemFilho1Idoso.setVisible(false);
        imagemFilho1IdosoMorre.setVisible(true);
        textFieldFilho1.setText("Filho 1 morre");
        textFieldFilho1.setVisible(true);

        System.out.println("O primeiro filho morre aos 61 anos de idade");
      }
    };
  }

  public class ProcessoSegundoFilhoMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 80*1000;
      temporizador.schedule(segundoFilhoMorre, tempo);
    }
    TimerTask segundoFilhoMorre = new TimerTask() {
      @Override
      public void run () {
        imagemFilho2Idoso.setVisible(false);
        imagemFilho2IdosoMorre.setVisible(true);
        textFieldFilho2.setText("Filho 2 morre");
        textFieldFilho2.setVisible(true);

        System.out.println("O segundo filho morre aos 55 anos de idade");
        
      }
    };
  }

  public class ProcessoTerceiroFilhoMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 87*1000;
      temporizador.schedule(terceiroFilhoMorre, tempo);
    }
    TimerTask terceiroFilhoMorre = new TimerTask() {
      @Override
      public void run () {
        textFieldFilho1.setVisible(false);
        textFieldFilho1.setText("");

        textFieldFilho2.setVisible(false);
        textFieldFilho2.setText("");

        textFieldBisneto1.setVisible(false);
        textFieldBisneto1.setText("");

        imagemFilho3Adulto.setVisible(false);
        imagemFilho3IdosoMorre.setVisible(true);
        textFieldFilho3.setText("Filho 3 morre");
        textFieldFilho3.setVisible(true);

        System.out.println("O terceiro filho morre aos 55 anos de idade");
      }
    };
    
  }

  public class ProcessoPrimeiroNetoMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 73*1000;
      temporizador.schedule(primeiroNetoMorre, tempo);
    }
    TimerTask primeiroNetoMorre = new TimerTask() {
      @Override
      public void run () {
        imagemFilho1Adulto.setVisible(false);
        imagemFilho1Idoso.setVisible(true);

        imagemFilho2Adulto.setVisible(false);
        imagemFilho2Idoso.setVisible(true);

        imagemFilho3Jovem.setVisible(false);
        imagemFilho3Adulto.setVisible(true);

        textFieldBisneto1.setVisible(false);
        textFieldBisneto1.setText("");

        imagemNeto1Adulto.setVisible(false);
        imagemNeto1Morre.setVisible(true);
        textFieldNeto1.setVisible(true);
        textFieldNeto1.setText("Neto 1 morre");

        FadeTransition ft2 = new FadeTransition(Duration.millis(600), imagemFundo1);
        imagemFundo2.setVisible(true);
        ft2.setFromValue(1.0);
        ft2.setToValue(0.0);
        ft2.play();

        FadeTransition ft = new FadeTransition(Duration.millis(800), imagemFundo2);
        imagemFundo2.setVisible(true);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();

        System.out.println("O primeiro neto morre aos 35 anos de idade");
      }
    };
    
  }

  public class ProcessoSegundoNetoMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 78*1000;
      temporizador.schedule(segundoNetoMorre, tempo);
    }
    TimerTask segundoNetoMorre = new TimerTask (){
      @Override
      public void run () {
        textFieldNeto1.setVisible(false);
        textFieldNeto1.setText("");

        imagemNeto2Jovem.setVisible(false);
        imagemNeto2Morre.setVisible(true);
        textFieldNeto2.setText("Neto 2 morre");
        textFieldNeto2.setVisible(true);

        System.out.println("O segundo neto morre aos 33 anos de idade");
      }
    };
    
  }

  public class ProcessoBisnetoMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 80*1000;
      temporizador.schedule(bisnetoMorre, tempo);
    }
    TimerTask bisnetoMorre = new TimerTask() {
      @Override
      public void run () {
        textFieldNeto2.setVisible(false);
        textFieldNeto2.setText("");

        ImageBisneto1Mirin.setVisible(false);
        imagemBisneto1Jovem.setVisible(false);
        imagemBisneto1Morre.setVisible(true);
        textFieldBisneto1.setText("Bisneto 1 morre");
        textFieldBisneto1.setVisible(true);
        
        System.out.println("Bisneto morre aos 12 anos de idade");
      }
    };
    
  }

  public class ProcessoPaiMorre extends Thread {
    @Override
    public void run () {
      Timer temporizador = new Timer();
      long tempo = 90*1000;
      temporizador.schedule(paiMorre, tempo);
    }
    TimerTask paiMorre = new TimerTask() {
      @Override
      public void run () {
        imagemPaiIdoso.setVisible(false);
        imagemPaiIdosoMorre.setVisible(true);
        textFieldPai.setText("Pai morre");
        textFieldPai.setVisible(true);

        System.out.println("Pai morre aos 90 anos de idade");
        System.out.println("\nFim\n");
      }
    };
  }
}
