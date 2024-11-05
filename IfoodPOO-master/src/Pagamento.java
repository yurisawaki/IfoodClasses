public interface Pagamento {
    double getValor();
    String getMetodo();
    void processarPagamento();
}
