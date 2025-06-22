//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TestIPhone();
    }

        public static void TestIPhone() {
        iPhone meuiPhone = new iPhone();

        System.out.println("=== REPRODUTOR MUSICAL ===");
        meuiPhone.selecionarMusica("Bohemian Rhapsody");
        meuiPhone.tocar();
        meuiPhone.pausar();

        System.out.println("\n=== APARELHO TELEFÔNICO ===");
        meuiPhone.ligar("(11) 99999-9999");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        System.out.println("\n=== NAVEGADOR INTERNET ===");
        meuiPhone.exibirPagina("https://www.apple.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();


    }
}