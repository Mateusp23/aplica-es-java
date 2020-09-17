public class exe02 {
    public static void main(String[] args){

        String texto = "I like Java";

        //Mostrar o tamanho da String
        System.out.println("O texto tem "+texto.length()+" letras");

        //Chamar uma letra específica da String, por exemplo a ultima
        System.out.println("A ultima letra do texto é: "+texto.charAt(texto.length()-1));

        //Chamar letra a letra do Texto através de um for
        for(int i=0; i< texto.length(); i++){
            System.out.println(texto.charAt(i));
        }
    }
}