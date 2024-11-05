public class Main {
    public static void main(String[] args) {
        // Criar um cliente e um restaurante
        Cliente cliente = new Cliente("João", "Belém");
        Restaurante restaurante = new Restaurante("Restaurante Exemplo");

        // Criar um pedido
        Pedido pedido = new Pedido(cliente, restaurante);

        // Adicionar itens ao pedido
        pedido.adicionarItem(50.0); // Exemplo de item com preço 50.0
        pedido.adicionarItem(30.0); // Exemplo de item com preço 30.0

        // Exibir total antes do desconto
        System.out.println("Total antes do desconto: R$ " + pedido.getTotal());

        // Criar um cupom de desconto
        CupomDesconto cupom = new CupomDesconto("DESCONTO20", 20.0); // Cupom com R$ 20.0 de desconto

        // Aplicar o cupom ao pedido
        double descontoAplicado = pedido.aplicarCupomDesconto(cupom);

        // Exibir o resultado
        if (descontoAplicado > 0) {
            System.out.println("Desconto aplicado: R$ " + descontoAplicado);
            System.out.println("Total após desconto: R$ " + pedido.getTotal());
        } else {
            System.out.println("Cupom inválido ou já utilizado.");
        }


        Notificacao notificacao = new Notificacao("1", "Seu pedido foi entregue!", "cliente123", StatusPedido.ENTREGUE);

        // Exibir a notificação
        notificacao.exibirNotificacao();

        // Marcar a notificação como lida
        notificacao.marcarComoLida();

        // Exibir a notificação novamente para ver o status atualizado
        notificacao.exibirNotificacao();
    }
}
