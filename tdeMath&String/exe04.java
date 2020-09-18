
import java.util.Scanner;

public class exe04 {
   //4 - Construa uma classe que receba uma frase qualquer e mostre essa frase de trás para a frente e sem espaços em branco.
  

   static class Main {
       public static void main(String[] args) {
           int i;
           Scanner ler = new Scanner(System.in);
           String frase;
           System.out.print("Digite uma frase: ");
           frase = ler.nextLine();

           System.out.println("A frase é: "+ frase);
           char fraseArray[] = frase.toCharArray();

           System.out.print("A frase ao contrario fica: ");
           for(i= fraseArray.length -1; i >= 0; i--){
               System.out.print(fraseArray[i]);
           }

       }
   }

}
