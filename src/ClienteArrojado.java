public class ClienteArrojado extends Cliente implements carteiraInvestimentos{


    public void contratarInvestimento(RendaVariavel Investimento) {
        this.carteiraInvestimentos.add(Investimento);

    }


}
