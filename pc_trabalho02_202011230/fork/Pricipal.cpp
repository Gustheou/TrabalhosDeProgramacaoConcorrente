/* ***************************************************************
* Autor............: Gustavo Pereira Nunes
* Matricula........: 202011230
* Inicio...........: 11/03/2022
* Ultima alteracao.: 12/03/2022
* Nome.............: Arvore Genealogica
* Funcao...........: O programa basicamente funciona como uma arvore genealogica, exibindo desde o nascimento ate a morte do "pai"
*************************************************************** */
#include <unistd.h>
#include <iostream>
#include <time.h>
using namespace std;

/* ***************************************************************
* Metodo: main
* Funcao: Realizar a execucao do programa
* Parametros: void
* Retorno: int
*************************************************************** */
int main(){
  pid_t idProcesso;  
  cout << "Nasce o pai" << endl;
  sleep(22); //O pai envelhece 22 anos  
  idProcesso = fork(); //O primeiro filho nasce
  
  if(idProcesso == -1){//O if eh para verificar se o id eh do pai ou do filho
    exit(1);
  }  
  if(idProcesso){
    cout << "O pai tem o primeiro filho aos 22 anos de idade" << endl;
    sleep(3); //Pai envelhece 3 anos
    idProcesso = fork(); //O pai tem o primeiro filho
    if(idProcesso == -1){
      exit(1);
    }
    if(idProcesso){
        cout << "O pai tem o segundo filho aos 25 anos de idade" << endl;
        sleep(7); // o pai envelhece 7 anos tendo agora 32 anos   
        idProcesso = fork(); //O pai tem o terceiro filho
        if(idProcesso == -1){
          exit(1);
        }        
        if(idProcesso){
          cout << "O pai tem o terceiro filho aos 32 anos de idade" << endl;
          sleep(58); //O pai envelhece 58 anos
          cout << "O pai morre aos 90 anos\n";
          _Exit(0);//Encerrar o processo
        }else{
          sleep(55);//filho envelhece 55 anos
          std::cout << "O terceiro filho morre aos 55 anos de idade" << endl;
          _Exit(0);//Encerrar o processo
        }
    }else{
      sleep(20); //Segundo filho envelhece 20 anos  
      idProcesso = fork(); //O pai se torna avo (segundo filho)
      if(idProcesso == -1){
        exit(1);
      }
      if(idProcesso){
        cout << "O pai e avo (segundo filho) aos 45 anos de idade" << endl;
        sleep(35);
        cout << "Morre o segundo filho aos 55 anos de idade" << endl;
        _Exit(0);
      }else{
        sleep(33);
        cout << "O segundo neto morre aos 33 anos de idade" << endl;
        _Exit(0);
      }      
    }  
  }else{
    sleep(16); //O primeiro filho envelhece 16 anos
    idProcesso = fork(); //O pai se torna avo (primeiro filho)
    if(idProcesso == -1){
      exit(1);
    }        
    if(idProcesso){
      cout << "O pai e avo (primeiro filho) aos 38 anos de idade" << endl;
      sleep(45); //O primeiro filho envelhece 45 anos
      cout << "primeiro filho morre aos 61 anos de idade" << endl;
      _Exit(0);    
    }else{        
      sleep(30); //O neto 1 envelhece 30 anos 
      idProcesso = fork(); //O pai se torna bisavo (primeiro filho)
      if(idProcesso == -1){
        exit(1);
      }    
      if(idProcesso){
        cout << "O pai e bisavo (primeiro filho) aos 68 anos de idade" << endl;
        sleep(5);
        cout << "O primeiro neto morre aos 35 anos de idade" << endl;
        _Exit(0);    
      }else{
        sleep(12); //O bisneto envelhece 12 anos
        cout << "O bisneto morre aos 12 anos de idade" << endl;
        _Exit(0);     
      }    
    }
  }      
  return 0;
}
