public class ClienteModerado extends Cliente implements carteiraInvestimentos{

    public <T extends Investimento> void contratarInvestimento(Investimento investimento) {
        this.carteiraInvestimentos.add(investimento);

    }
}
