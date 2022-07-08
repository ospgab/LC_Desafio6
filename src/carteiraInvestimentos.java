

public interface carteiraInvestimentos <T extends Investimento> {

    public <T extends Investimento> void contratarInvestimento(T e);
    public <T> void resgatarInvestimento(T e);

}
