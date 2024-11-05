public class Notificacao {
    private String id;                  // Identificador único da notificação
    private String mensagem;            // Mensagem da notificação
    private String destinatarioId;      // Identificador do destinatário (cliente ou restaurante)
    private StatusPedido statusPedido;   // Status do pedido associado à notificação
    private boolean lida;               // Indica se a notificação foi lida

    // Construtor
    public Notificacao(String id, String mensagem, String destinatarioId, StatusPedido statusPedido) {
        this.id = id;
        this.mensagem = mensagem;
        this.destinatarioId = destinatarioId;
        this.statusPedido = statusPedido;
        this.lida = false; // notificacao nao lida, por padrao
    }

    // Métodos Getters
    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDestinatarioId() {
        return destinatarioId;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public boolean isLida() {
        return lida;
    }

    // Método para marcar a notificação como lida
    public void marcarComoLida() {
        this.lida = true;
    }

    // Método para exibir a notificação
    public void exibirNotificacao() {
        System.out.println("Notificação ID: " + id);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Destinatário ID: " + destinatarioId);
        System.out.println("Status do Pedido: " + statusPedido);
        System.out.println("Lida: " + (lida ? "Sim" : "Não"));
    }
}