public non-sealed class IngressoFamilia extends Ingresso{

    private final int Pessoas;

    public IngressoFamilia(double Valor, String Nome, boolean Dublado, int Pessoas) {
        super(Valor, Nome, Dublado);
        this.Pessoas = Pessoas;
    }

    @Override
    public double getValor(){
        if (Pessoas > 3){
            return super.getValor() * Pessoas * 0.95;
        }
        else{
            return super.getValor() * Pessoas;
        }
    }
}
