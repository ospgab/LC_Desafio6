public class ClienteConservador<T extends Investimento> extends Cliente implements carteiraInvestimentos {



    public <T extends Investimento> void contratarInvestimento(T a) {
        this.carteiraInvestimentos.add(a);
    }



    @Override
    public void resgatarInvestimento(Object e) {

    }
}
