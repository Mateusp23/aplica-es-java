import java.util.Scanner;

public class Converter {

    public double Real(){
        Scanner ler= new Scanner(System.in);
        System.out.print("Digite um valor em reais: R$");
        double real = ler.nextDouble();
        return real;
    }

    public double Dolar(){
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite a cotação do dolar atualmente: US$");
        double dolares = tc.nextDouble();
        return dolares;
    }

    public double Bitcoin(){
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite a cotação do bitcoin atualmente: BTC");
        double bit = tc.nextDouble();
        return bit;
    }

    public double Dolar_real_bit(){
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o valor em dolar: US$");
        double dolares = tc.nextDouble();
        return dolares;
    }
}
