
import java.util.Random;

public class exe03 {
   //3- Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random. Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma quantidade de dígitos correspondentes ao valor aleatório gerado. Apresente em tela o número sorteado e a senha.

   static class Main {
       public static void main(String[] args) {
           int i;
           int password;
           Random aleatorio  = new Random();
           int valorSenha = aleatorio.nextInt((10-5)+1)+5;
           System.out.println("Os numeros da senha são: "+ valorSenha);

           System.out.print("A nova senha é: ");

           for(i=0; i < valorSenha; i++){
               password = (int)(Math.random()*10);
               System.out.print(password);
           }

       }
   }
}
