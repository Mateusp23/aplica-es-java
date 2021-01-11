import java.util.Scanner;

public class ContaCorrente{


    public String agencia;
    public int numero;
    public static int ultimaConta=1;
    public double saldo;
    public double limite;
    public Cliente titular;


    public void lerDados() {
        Scanner tc = new Scanner(System.in);
        System.out.print("\ninforme a agencia: ");
        this.agencia = tc.next();
        this.numero = ultimaConta;
        this.saldo = 0;
        this.titular = new Cliente();
        this.titular.ler();
        ultimaConta++;


        if (this.titular.idade > 60) {
            this.limite = 1000;
        } else{
            this.limite = 100;
        }
    }
    public void infoCliente(){
        System.out.println("-------------------------");
        System.out.println("Número: "+this.numero);
        System.out.println("Cliente: "+this.titular.nome);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("CPF: "+this.titular.cpf);
        System.out.println("Idade: "+this.titular.idade);
        System.out.println("-------------------------");
    }





    public boolean transferencia(double valor, ContaCorrente destino){
        if(saque(valor)){
            destino.deposito(valor);
        }else{
            return false;
        }
        return false;
    }
    public boolean deposito(double valor){
        if(valor>0){
            this.saldo+= valor; //  ou this.saldo = this.aldo + valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean saque(double valor){
        if(valor<=(saldo+limite)){
            this.saldo-=valor;
            return true;
        }else{
            System.out.println("saldo insuficiente");
            return false;
        }
    }
    public void getSaldo(){
        System.out.println("-------------------------");
        System.out.println("Cliente: "+this.titular.nome);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("Valor disponivel para saque: "+(this.limite+this.saldo));
        System.out.println("-------------------------");

    }


}


