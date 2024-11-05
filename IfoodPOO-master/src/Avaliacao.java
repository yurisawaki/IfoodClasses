public class Avaliacao {
    private Cliente cliente;
    private Restaurante restaurante;
    private int nota;
    private String comentario;

    public Avaliacao(Cliente cliente, Restaurante restaurante, int nota, String comentario) {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }
}
