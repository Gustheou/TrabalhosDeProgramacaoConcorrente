Este programa tem a finalidade de retratar o meu "sistema sagres" baseado nas informações que possuo no momento. Este projeto foi compilado no JDK 17, e para que seja executado, foi necessário que primeiro haja a compilação e para compilar todos os arquivos com a extensão .java é necessário executar o seguinte comando:
javac --module-path /home/gustavo/Documentos/pc_trabalho01_202011230/biblioteca/javafx-sdk-17.0.1/lib --add-modules javafx.controls,javafx.fxml *.java
 
O "*" serve para selecionar todos os arquivos e o .java é para especificar qual(is) arquivo(s) será(ão) selecionado(s) para compilar.
Lembre-se de mudar o caminho: "/home/gustavo/Documentos/TrabalhoMarlos/biblioteca/javafx-sdk-17.0.1/lib" para o caminho que se encontra o lib do jdk na sua máquina (a biblioteca está na pasta "biblioteca" deste projeto).

Após compilado, o programa precisa ser executado, com a mesmo lembrete anterior.
java --module-path /home/gustavo/Documentos/pc_trabalho01_202011230/biblioteca/javafx-sdk-17.0.1/lib --add-modules javafx.controls,javafx.fxml Principal


