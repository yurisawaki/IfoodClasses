public class Pedido {
    private Cliente cliente;
    private Restaurante restaurante;
    private Pagamento pagamento;
    private double total;
    private StatusPedido status; // Atributo para armazenar o status do pedido

    public Pedido(Cliente cliente, Restaurante restaurante) {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.total = 0.0;
        this.status = StatusPedido.AGUARDANDO_CONFIRMACAO; // Status inicial
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public double getTotal() {
        return total;
    }

    public void adicionarItem(double preco) {
        this.total += preco;
    }

    public double aplicarCupomDesconto(CupomDesconto cupom) {
        if (cupom.isAtivo()) {
            double descontoAplicado = Math.min(cupom.getValorDesconto(), total);
            total -= descontoAplicado;
            cupom.desativar();
            return descontoAplicado;
        }
        return 0.0;
    }

    // Método para obter o status do pedido
    public StatusPedido getStatus() {
        return status;
    }

    // Método para atualizar o status do pedido
    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }
}