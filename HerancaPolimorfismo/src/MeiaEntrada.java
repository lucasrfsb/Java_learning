public non-sealed class MeiaEntrada extends Ingresso{

    public MeiaEntrada(double Valor, String Nome, boolean Dublado) {
        super(Valor, Nome, Dublado);
    }

    @Override
    public double getValor(){
        return super.getValor() / 2;
    }
}
