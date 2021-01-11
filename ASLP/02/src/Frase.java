    import java.util.Scanner;

    public class Frase {
       //2-Faça um programa no qual o usuários irá digitar uma frase, depois uma palavra de até 5 caracter.
       //O Programa deve verificar se a palavra existe na frase. (PESO 1)
        public static void main(String[] args){
            Scanner tc = new Scanner(System.in);
            String frase;
            String palavra_caractere;
            int maximo_caractere = 5;

            System.out.print("Digite uma frase:");
            frase = tc.nextLine();
            System.out.println("Digite uma palavra até 5 caracteres:");
            palavra_caractere = tc.nextLine();
            Boolean palavra_na_frase = frase.contains(palavra_caractere);
            if(palavra_na_frase == true || (palavra_na_frase.equals(""))){
                if(palavra_caractere.length()>maximo_caractere){
                    System.out.println("A palavra existe na frase, porém tem mais de 5 caracteres!!");
                }else{
                    System.out.println("A palavra existe na frase e é menor ou igual a 5 caracteres!!");
                }
            }else{
                System.out.println("A palavra não existe na frase!! ");
            }
        }
    }
