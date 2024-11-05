public class PagamentoCartao implements Pagamento {
    private double valor;
    private String tipoCartao;
    private String metodo;

    public PagamentoCartao(double valor, String tipoCartao) {
        this.valor = valor;
        this.tipoCartao = tipoCartao;
        this.metodo = "Cartão " + tipoCartao;
    }

    @Override
    public double getValor() {
        return valor;
    }
    @Override
    public String getMetodo() {
        return metodo;
    }
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com " + metodo + " de R$ " + valor); }
}
