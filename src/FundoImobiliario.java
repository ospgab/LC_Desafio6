import java.math.BigDecimal;

public class FundoImobiliario extends RendaVariavel{

    private final String nome = "Fundo Imobiliário";
    private BigDecimal valorMinimo = BigDecimal.valueOf(120);
    private double lucroAnual = 0.13;

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
