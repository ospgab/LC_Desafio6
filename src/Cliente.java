import java.util.ArrayList;

public abstract class Cliente <T extends Investimento>{

    protected ArrayList<T> carteiraInvestimentos;
    protected byte tipoConta;



    public ArrayList<T> getCarteiraInvestimentos(){
        return this.carteiraInvestimentos;
    }



    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for(Investimento i : carteiraInvestimentos){
            saida.append(i);
        }
        return saida.toString();
    }
}
