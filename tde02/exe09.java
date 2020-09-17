import java.util.Scanner;

public class exe09 {
    public static void main(String[] args){

        String[] vaga = new String[10];
        int opition = 0;

        Scanner input = new Scanner(System.in);

        for(int i=0; i<vaga.length; i++){
            vaga[i] = "";
        }

        do{
            System.out.println("Digite sua operação: \n 1 - Entrada \n 2 - Saída \n 3 - Listar \n 4 - Encerrar");
            opition = input.nextInt();

            while(opition>4 || opition<1){
                System.out.println("operação inválida, escolha novamente: \n 1 - Entrada \n 2 - Saída \n 3 - Listar \n 4 - Encerrar");
                opition = input.nextInt();
            }

            switch(opition){

                case 1:

                    for(int i=0; i<vaga.length; i++){
                        if(vaga[i]==""){
                            System.out.println("Digite a placa do carro: ");
                            vaga[i] = input.next();
                            break;
                        }
                    }

                break;

                case 2:

                    int saida = 0;
                    System.out.println("Selecione o número da vaga que será liberada: ");
                    saida = input.nextInt();

                    while(saida>10 || saida<1){
                        System.out.println("Vaga inválida, selecione outra: ");
                        saida = input.nextInt();
                    }

                    if(vaga[saida-1]==""){
                        System.out.println("Vaga vazia");
                    }else{
                        vaga[saida-1] = "";
                        System.out.println("Saída realizada com sucesso!");
                    }

                break;

                case 3:
                
                    System.out.println("As vagas preenchidas são: ");

                    for(int i=0; i<vaga.length; i++){
                        if(vaga[i]!=""){
                            System.out.println("Vaga "+ (i+1) + " está ocupada pelo veiculo: "+vaga[i]);
                        }
                    }

                break;
            }

        }while(opition!=4);

        System.out.println("Programa encerrado com sucesso!");
    }
}
