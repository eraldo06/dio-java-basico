public interface IConta {
    void sacar(double valor);
    void desopitar(double valor);
    void tranferir(double valor, Conta contaDestino);
    void imprimirExtrato();
    
}
