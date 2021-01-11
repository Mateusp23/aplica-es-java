public class Main {
    public static void main(String[] args){
        Converter convercao_de_valores = new Converter();

        System.out.println("---------------------------------------");
        System.out.println("-- Conversão de Reais para Dolares. --"); // a)
        double valor_dolar = convercao_de_valores.Real() / convercao_de_valores.Dolar();
        System.out.printf("\nO valor em dolar é de: US$%.2f\n", valor_dolar);

        System.out.println("-- Conversão de Reais para Bitcoins. --"); // b)
        double valor_bitcoin = convercao_de_valores.Real() / convercao_de_valores.Bitcoin();
        System.out.printf("\nO valor em Bitcoin será: BTC%.4f\n", valor_bitcoin);

        System.out.println("---------------------------------------");
        System.out.println("-- Conversão de Dolares para Reais. --"); //c)
        double divide = convercao_de_valores.Dolar_real_bit() * convercao_de_valores.Dolar();
        System.out.printf("\nO valor do dolar em real é: R$%.2f\n" , divide);

        double valor_final;
        System.out.println("---------------------------------------");
        System.out.println("-- Conversão de Dolares para Reais e o valor será transmitido em Bitcoins. --"); // d)
        double valor_dolar_bitcoin = convercao_de_valores.Dolar_real_bit() * convercao_de_valores.Dolar();
        valor_final=valor_dolar_bitcoin/convercao_de_valores.Bitcoin();
        System.out.printf("\nO Valor transmitido em bitcoins: BTC%.4f\n", valor_final);
    }
}
