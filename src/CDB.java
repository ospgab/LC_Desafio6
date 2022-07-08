import java.math.BigDecimal;

public class CDB extends RendaFixa{

    private final String nome = "CDB";
    private BigDecimal valorMinimo = BigDecimal.valueOf(30);
    private double lucroAnual = 0.02;

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void setLucroAnual(double lucroAnual) {
        this.lucroAnual = lucroAnual;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public BigDecimal getValorMinimo() {
        return this.valorMinimo;
    }

    @Override
    public double getLucro() {
        return this.lucroAnual;
    }
}
