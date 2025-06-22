public sealed class Ingresso permits MeiaEntrada, IngressoFamilia{

    private final double Valor;
    private final String Nome;
    private final boolean Dublado;


    public Ingresso(double Valor, String Nome, boolean Dublado){
        this.Valor = Valor;
        this.Nome = Nome;
        this.Dublado = Dublado;
    }

    public double getValor(){
        return this.Valor;
    }

    public String getNome() {
        return Nome;
    }

    public boolean isDublado() {
        return Dublado;
    }
}
