import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

    public class Teclado {
        Scanner sc = new Scanner(System.in);

            //codigo produzido pela dupla Mateus Paulart e Otavio Borges
        //A e B:

        public String lerString(){
            return lerString("Digite uma String: ");
        }
        public String lerString(String msg){
            System.out.print(msg);
            return sc.nextLine();
        }

        public float lerFloat(){
            return lerFloat("Digite um Float: ");
        }
        public float lerFloat(String msg){
            System.out.print(msg);
            return sc.nextFloat();
        }

        public double lerDouble(){
            return lerDouble("Digite um Double: ");
        }
        public double lerDouble(String msg){
            System.out.print(msg);
            return sc.nextDouble();
        }

        public int lerInt(){
            return lerInt("Digite um Inteiro: ");
        }
        public int lerInt(String msg){
            System.out.print(msg);
            return sc.nextInt();
        }

        public char lerChar(){
            System.out.print("Digite um Char: ");
            String lida = sc.next();
            return lida.charAt(0);
        }
        public char lerChar(String msg){
            System.out.print(msg);
            return sc.next().charAt(0);
        }

        //A,B,C,D,E

        public String lerEmail(){
            Scanner lerEmail = new Scanner(System.in);
            String email;

            System.out.print("Digite um email: ");
            email = lerEmail.nextLine();

            if (!email.contains("@")){
                email = "null";
            }
            return email;
        }

        public String lerTelefone(){
            Scanner lerTel = new Scanner(System.in);
            String telefone;
            String regex = "\\d*";

            System.out.print("Digite um número de telefone: ");
            telefone = lerTel.nextLine();

            if (telefone.length()==11 && telefone.matches(regex)){
                telefone = ("(" + telefone.substring(0, 2) + ")" + telefone.substring(2, 7) + "-" + telefone.substring(7, 11));
            }else{
                telefone = "null";
            }
            return telefone;
        }

        public String lerData(){
            Scanner lerDate = new Scanner(System.in);
            String data;

            System.out.print("Digite uma data desta forma -> dd/mm/aaaa: ");
            data = lerDate.nextLine();

            if (data.indexOf('/')==2 && data.lastIndexOf('/')==5 && data.length()==10){
                return data;
            }else{
                data = "null";
                return data;
            }
        }

        public String convertData(){
            String saidaData;
            Date hoje = new Date();

            SimpleDateFormat formatador = new SimpleDateFormat("MM/dd/yyyy");
            saidaData = formatador.format(hoje);

            return saidaData;
        }

        public String verificaDado(){
            Scanner lerDado = new Scanner(System.in);
            String dado;
            String regex = "\\d*";

            System.out.print("Digite um número: ");
            dado = lerDado.nextLine();

            if (dado.matches(regex)){
                return dado;
            }else{
                dado = "null";
            }
            return dado;
        }
    }


        //codigo produzido pela dupla Mateus Paulart e Otavio Borges

