import java.util.Scanner;

public class exe05 {
    public static void main(String[] args){

        double nota[] = new double[5];
        double aux = 0;
        int k = nota.length - 1;

        Scanner input = new Scanner(System.in);

        for(int i=0; i<=4; i++){
            System.out.println("Digite a " + (i+1) + "ª nota: ");
            nota[i] = input.nextDouble();
        }

        //metodo de ordenação bolha

        for(int i = 0; i<5; i++){
            for(int j=0; j<4; j++){
                if(nota[j]> nota[j+1]){
                    aux = nota[j];
                    nota[j] = nota[j+1];
                    nota[j+1] = aux;
                }
            }
        }

        for(int i = 0; i<(nota.length/2); i++){
            aux = nota[i];
            nota[i] = nota[k];
            nota[k] = aux;
            k--;
        }

        for(int i=0; i<5; i++){
            System.out.println(nota[i]);
        }

    }
}