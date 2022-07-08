import java.math.BigDecimal;

public class Acao extends RendaVariavel{

    private final String nome = "Ação";
    private BigDecimal valorMinimo = BigDecimal.valueOf(1000);
    private double lucroAnual = 0.1;

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
