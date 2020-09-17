import java.util.Random;

public class exe08 {
    public static void main(String[] args){
        int[] par = new int[10];
        int[] impar = new int[10];

        Random random = new Random();

        for(int i=0; i<10; i++){
            int j = random.nextInt(20);
            if(j % 2 == 0){
                par[i] = j;
            }else{
                impar[i] = j;
            }
        }

        System.out.println("Os numeros pares são: ");

        for(int i=0; i<10; i++){
            if(par[i]!=0){
                System.out.println(par[i]);
            }
        }

        System.out.println("Os numeros impares são: ");

        for(int i=0; i<10; i++){
            if(impar[i]!=0){
                System.out.println(impar[i]);
            }
        }

    }
}