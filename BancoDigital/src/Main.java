import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente("Lucas");
        Cliente xalala = new Cliente("Xalala");

        Conta cc = new ContaCorrente(lucas);
        Conta cc2 = new ContaCorrente(xalala);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(lucas);

        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


        Banco banco = new Banco();
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cc2);
        banco.setContas(contas);
        banco.imprimirNomesClientes();
    }
}