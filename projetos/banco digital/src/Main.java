public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.desopitar(100);
        cc.tranferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
