import java.util.Scanner;

public class exe04 {
    public static void main(String[] args){

        String palavra, reverso = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra=input.next();

        for(int i=palavra.length()-1; i>=0; i--){
            reverso += palavra.charAt(i);
        }

        if(palavra.equals(reverso)){
            System.out.println("O String " + palavra + " é um palíndromo");
        }else{
            System.out.println("O String " + palavra + " não é um palíndromo");
        }
    }
}