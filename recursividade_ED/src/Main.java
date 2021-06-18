public class Main {

    public static void main(String[] args) {

        int vet [] = { 10,10,15,20,5 };

        System.out.println("\nOs elementos do Array são:");

        for(int cont = 0; cont < vet.length; cont++){
            System.out.print(vet[cont] + " ");
        }

        int soma_final = calcularSomaArray( vet , 0);
        int maior_num = maiorNumeroArray(vet, 0,0);

        System.out.println("\nA soma do Array acima é: " + soma_final);
        System.out.println("O maior numero do Array é: " + maior_num);
    }

    private static int calcularSomaArray(int vet [], int i){

        if ( i < vet.length ) {
            return vet[i] + calcularSomaArray( vet, i + 1 );
        } else {
            return 0;
        }
    }

    private static int maiorNumeroArray (int vet [], int m, int x) {

        if ( x < vet.length ) {
            if (vet[x] > m) {
                m = vet[x];
            }
            x++;
            return maiorNumeroArray ( vet, m, x );
        } else {
            return m;
        }
    }
}
