public class exe03 {
    public static void main(String[] args){

        double vetor[]= new double[4];
        double[] vetor2 = {5,6,7,8};
        int i;

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;

        for (i=0; i< vetor.length;i++) {
            System.out.println(vetor[i]);
        } 
            
        for(i=0; i<vetor2.length;i++){
            System.out.println (vetor2[i]);
        }
    }
}