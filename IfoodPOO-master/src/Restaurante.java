import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private List<Categoria> itens;
    private List<Avaliacao> avaliacoes;

    public Restaurante(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarItem(Categoria item) {
        itens.add(item);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void exibirMenu() {
        System.out.println("Menu do Restaurante " + nome + ":");

        System.out.println("\nComidas:");
        for (Categoria item : itens) {
            if (item instanceof PratoPrincipal) {
                item.exibirDetalhes();
            }
        }

        System.out.println("\nBebidas:");
        for (Categoria item : itens) {
            if (item instanceof Bebidas) {
                item.exibirDetalhes();
            }
        }

        System.out.println("\nSobremesas:");
        for (Categoria item : itens) {
            if (item instanceof Sobremesa) {
                item.exibirDetalhes();
            }
        }
    }

}
