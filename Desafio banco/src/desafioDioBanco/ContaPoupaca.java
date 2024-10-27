package desafioDioBanco;

public class ContaPoupaca extends Conta {


    public ContaPoupaca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrat() {
        System.out.println( "===== Extrato Conta Poupança =====");
        super.imprimirInfosComuns();

    }
}
