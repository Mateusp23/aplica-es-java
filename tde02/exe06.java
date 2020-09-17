import java.util.Random;

public class exe06 {
    public static void main(String[] args){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", 
                        "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro"};

        Random random = new Random();

        System.out.println(meses[random.nextInt(11)]);
    }
}
