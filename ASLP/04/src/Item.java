import java.util.Objects;

public class Item {

    public static int produtoFinal =1;
    public static double listagem_total=0;
    public static int quantidade_total=0;
    public String nome;
    public int quantidade;
    public double preco;
    public int numeroProd;

    public Item(String prod, int quantidade, double preco){
        this.nome = prod;
        this.quantidade = quantidade;
        this.preco = preco;
        this.numeroProd = produtoFinal;
        this.produtoFinal++;
        listagem_total = listagem_total + preco * quantidade;
        quantidade_total = quantidade_total + quantidade;
    }

    public Item(int id_produto){
        this.numeroProd = id_produto;
    }

    public void infoProduto(){
        System.out.println("-------------------------");
        System.out.println("Informações do produto:");
        System.out.println("Código: "+this.numeroProd);
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço: R$"+this.preco);
        System.out.println("Quantidade de produtos: "+this.quantidade);
        System.out.println("Total: R$"+this.quantidade*this.preco);
        System.out.println("-------------------------");
    }

    public void listarItensRemocao(){
        System.out.println("-------------------------");
        System.out.println("Informe o código do produto a ser removido.");
        System.out.println("Código do Produto: "+this.numeroProd);
        System.out.println("Nome do Produto: "+this.nome);
        System.out.println("\nTotal de produtos: R$"+this.quantidade);
        System.out.println("-------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return numeroProd == item.numeroProd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroProd);
    }
}
