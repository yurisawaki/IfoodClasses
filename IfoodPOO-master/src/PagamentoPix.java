public class PagamentoPix implements Pagamento {
    private double valor;
    private String metodo;

    public PagamentoPix(double valor) {
        this.valor = valor;
        this.metodo = "Pix";
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
        System.out.println("Processando pagamento via " + metodo + " de R$ " + valor); }
}
