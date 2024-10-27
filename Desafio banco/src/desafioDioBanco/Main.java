package desafioDioBanco;

public class Main {

    public static void main(String[] args) {
        Cliente wilians = new Cliente();
        wilians.setNome("wilians");

        Conta cc = new ContaCorrente(wilians);
        cc.depositar(100);

        Conta cp = new ContaPoupaca(wilians);
        cc.transferir(50,cp);

        cc.imprimirExtrat();

        cp.imprimirExtrat();

    }
}
