public sealed class Ingresso permits MeiaEntrada, IngressoFamilia{

    private double Valor;
    private String Nome;
    private boolean Dublado;

    public Ingresso(double Valor, String Nome, boolean Dublado){
        this.Valor = Valor;
        this.Nome = Nome;
        this.Dublado = Dublado;
    }

    public double getValor(){
        return this.Valor;
    }

}
