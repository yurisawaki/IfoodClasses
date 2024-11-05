public class CupomDesconto {
    private String codigo;
    private double valorDesconto; // Valor do desconto em reais
    private boolean ativo; // Indica se o cupom está ativo

    public CupomDesconto(String codigo, double valorDesconto) {
        this.codigo = codigo;
        this.valorDesconto = valorDesconto;
        this.ativo = true; // Por padrão, o cupom é ativo ao ser criado
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        this.ativo = false; // Método para desativar o cupom
    }
}