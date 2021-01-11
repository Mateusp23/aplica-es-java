import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        ArrayList<Item> lista_de_compras = new ArrayList();

        int resposta;
        int id_produto;
        do{
            System.out.println("Selecione a opção desejada:\n1 - Adicionar \n2 - Remover \n3 - Listar Itens \n4 - Total da Lista \n5 - Encerrar programa \n");
            resposta = tc.nextInt();
            if(resposta!=5){
                switch (resposta){
                    case 1: {
                        System.out.print("\nDigite o nome do produto: ");
                        tc.nextLine();
                        String prod = tc.nextLine();
                        System.out.print("Digite o valor do produto: R$");
                        double preco = tc.nextDouble();
                        System.out.print("Digite a quantidade de produtos: ");
                        int quantidade = tc.nextInt();
                        Item produtos = new Item(prod, quantidade, preco);
                        lista_de_compras.add(produtos);
                    }
                    break;
                    case 2: {
                        if(lista_de_compras.size()==0) {
                           System.out.println("Não há produtos para remoção");
                       }else {
                            for (int i = 0; i < lista_de_compras.size(); i++) {
                                lista_de_compras.get(i).listarItensRemocao();
                            }
                            id_produto = tc.nextInt();
                            Item remover = new Item(id_produto);
                            lista_de_compras.remove(remover);
                        }
                    }
                    break;
                    case 3: {
                        if(lista_de_compras.size()==0){
                            System.out.println("Não há produtos adicionados");
                        }else{
                            System.out.println("\nProdutos listados: ");
                            for (int i = 0; i < lista_de_compras.size(); i++) {
                                lista_de_compras.get(i).infoProduto();
                            }
                        }
                    }
                    break;
                    case 4: {
                        if(lista_de_compras.size()==0) {
                            System.out.println("Não há produtos adicionados");
                        }else {
                            System.out.println("\nTotal de valor e produtos da lista: ");
                            System.out.println("R$" + Item.listagem_total);
                            System.out.println("Produtos: " + Item.quantidade_total);
                        }
                    }
                    break;
                    default: {
                        System.out.println("Valor inválido. Digite novamente!");
                    }
                    break;
                }
            }
        }while (resposta !=5);
    }
}
