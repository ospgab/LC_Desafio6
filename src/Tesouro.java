import java.math.BigDecimal;

public class Tesouro extends RendaFixa{

    private final String nome = "Tesouro";
    private BigDecimal valorMinimo = BigDecimal.valueOf(100);
    private double lucroAnual = 0.05;

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void setLucroAnual(double lucroAnual) {
        this.lucroAnual = lucroAnual;
    }

    @Override
    public String getNome() {return this.nome;}

    @Override
    public BigDecimal getValorMinimo() {
        return this.valorMinimo;
    }

    @Override
    public double getLucro() {
        return this.lucroAnual;
    }
}
