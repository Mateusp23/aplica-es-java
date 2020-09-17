import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int data[] = new int[4];
        int i;
        String exibe;

        data[0]=3;
        data[1]=4;
        data[2]=1;
        data[3]=5;

        exibe="";

        Scanner input = new Scanner (System.in);

        for(i=0; i<4; i++){
            if(i==3){
                exibe+=Integer.toString(data[i]);   
            }else{
            exibe+=Integer.toString(data[i])+", ";
            }
        }
        
        System.out.println("{" + exibe + "}");
    }