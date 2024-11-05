public abstract class Categoria {
    private String nome;
    private double preco;
    private String descricao;

    public Categoria(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Métodos getters e setters comuns
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public String getDescricao() { return descricao; }

    // Método para exibir detalhes do item
    public void exibirDetalhes() {
        System.out.println(nome + ": " + descricao + " - R$ " + preco);
    }

}
