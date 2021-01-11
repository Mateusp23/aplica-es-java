
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        int resp;
        int codCliente;
        int codCliente2;
        
        
        Scanner r = new Scanner(System.in);

        ArrayList<ContaCorrente> cliente= new ArrayList<>();
        
        do {
            
            ContaCorrente correntista = new ContaCorrente();
            correntista.lerDados();
            cliente.add(correntista);

            System.out.println("Adicionar mais correntistas?\n(1-Sim 0-Não)");
            resp = r.nextInt();
            
        }while(resp != 0);

        for (int i = 0; i < cliente.size(); i++) {

            cliente.get(i).infoCliente();

        }

        do {

            System.out.println("Informe o Código do Cliente: ");
            codCliente = r.nextInt();
            ContaCorrente c1 = cliente.get(codCliente-1);
            
            System.out.println("Selecione a operação:\n1 - Saque \n2 - Depósito\n3 - Transferência \n4 - Extrato \n0 - Finalizar Sessão \n");
            resp = r.nextInt();

            if (resp!=0){

                switch (resp){

                    case 1:

                        Scanner lerSaque = new Scanner(System.in);
                        System.out.println("\nDigite o valor do saque: ");

                        double saque = lerSaque.nextDouble();
                        c1.saque(saque);
                        c1.getSaldo();

                        break;

                    case 2:

                        Scanner lerDep = new Scanner(System.in);
                        System.out.println("\nDigite o valor do Deposito: ");

                        double deposito = lerDep.nextDouble();
                        c1.deposito(deposito);
                        c1.getSaldo();

                        break;

                    case 3:
                        System.out.println("Informe o Código do Cliente: ");
                        codCliente2 = r.nextInt();
                        ContaCorrente c2 = cliente.get(codCliente2-1);


                        Scanner lerOperacoes = new Scanner(System.in);
                        System.out.println("\nDigite o valor da transferencia: ");
                        double ops = lerOperacoes.nextDouble();

                        if (c1.titular.cpf.equals(c2.titular.cpf)) {
                            System.out.println("Não foi possível realizar a transferência, divergencia nos documentos.");
                        } else {
                            c1.transferencia(ops, c2);
                            System.out.println("transferencia realizada!");
                            c1.getSaldo();
                            c2.getSaldo();
                        }
                        break;

                    case 4:

                        c1.getSaldo();

                        break;
                    default:
                        System.out.println("Código invalido!!");
                        break;
                }
            }

        }while (resp != 0);
    }
}
