
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exe02 {

   static class Main {
       public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);
           double valorProduto;
           double valorFinal;
           DecimalFormat df = new DecimalFormat("0.00");
           df.setRoundingMode(RoundingMode.HALF_UP);
           System.out.println("Para encerrar o programa digite 0.");
           do{
               System.out.print("Informe o valor do produto: ");
               valorProduto = ler.nextDouble();
               valorFinal = valorProduto*1.12;
               System.out.println("Valor do produto reajustado: "+ df.format(valorFinal));
           }while(valorProduto != 0);
       }
   }
}

