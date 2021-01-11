public class Main {
    //codigo produzido pela dupla Mateus Paulart e Otavio Borges
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        String linha = teclado.lerString();
        float real = teclado.lerFloat();
        double dabao = teclado.lerDouble();
        int inteiro = teclado.lerInt();
        char caractere = teclado.lerChar();
        String email = teclado.lerEmail();
        String telefone = teclado.lerTelefone();
        String data = teclado.lerData();
        String dataC = teclado.convertData();
        String dado = teclado.verificaDado();

        System.out.println("\n\n");
        System.out.println(linha);
        System.out.println(real);
        System.out.println(dabao);
        System.out.println(inteiro);
        System.out.println(caractere);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(data);
        System.out.println(dataC);
        System.out.println(dado);
    }
}
