import java.util.Random;

public class exe07 {
    public static void main(String[] args){
        int[][] pixel = new int[40][40];

        Random random = new Random();

        for(int i = 0; i<40; i++){
            for(int j = 0; j<40; j++){
                pixel[i][j] = random.nextInt(255);
            }
        }

        for(int i = 0; i<40; i++){
            for(int j = 0; j<40; j++){
                System.out.println(pixel[i][j]);
            }
        }
        System.out.println(" ");
    }
}