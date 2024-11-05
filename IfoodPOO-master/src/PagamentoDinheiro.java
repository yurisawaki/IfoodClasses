public class PagamentoDinheiro implements Pagamento {
    private double valor;
    private String metodo;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
        this.metodo = "Dinheiro"; // Definindo o método de pagamento como "Dinheiro"
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
        System.out.println("Processando pagamento de R$ " + valor + " em " + metodo + ".");
        // Aqui você pode adicionar lógica adicional para processar o pagamento
    }
}