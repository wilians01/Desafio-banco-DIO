package desafioDioBanco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrat() {

        System.out.println( "===== Extrato Conta Corrente =====");
        super.imprimirInfosComuns();
    }
}
