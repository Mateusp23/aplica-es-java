
import java.util.Random;

public class exe01 {
   public static void main(String[] args) {
       int resultado;
       int sorteio1 = (int) (Math.random() *6);
       System.out.println("O primeiro numero sorteado é: "+ sorteio1);
       int sorteio2 = (int) (Math.random() *6);
       System.out.println("O segundo numero sorteado é "+sorteio2);
       int sorteio3 = (int) (Math.random() *6);
       System.out.println("O terceiro numero sorteado é: "+ sorteio3);
       resultado = sorteio1 + sorteio2 + sorteio3;
       System.out.println("A soma de todos foi igual a: "+resultado);
   }
}
