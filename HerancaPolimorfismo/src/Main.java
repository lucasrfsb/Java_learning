//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testIngresso();

    }

    public static void testIngresso(){
        Ingresso test = new Ingresso(100, "Filme", false);

        MeiaEntrada ingresso = new MeiaEntrada(100, "Filme", false);
        System.out.printf("ingresso: %.2f\n",ingresso.getValor());

        IngressoFamilia familia = new IngressoFamilia(100, "Filme", false, 2);
        System.out.printf("familia: %.2f\n",familia.getValor());
    }

}