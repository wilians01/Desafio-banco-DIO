package desafioDioBanco;

public interface IConta {
    // Por ser uma interface não presisa colocar publico pois tem quer ser publico

     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor,Conta contaDestino);

     void imprimirExtrat();

}
