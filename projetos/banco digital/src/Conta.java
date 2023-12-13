public abstract class Conta implements IConta {

    private static final int AGENCIA_PARADO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia =  Conta.AGENCIA_PARADO;
        this.numero = SEQUENCIAL++;
    }



    public void sacar(double valor){
        saldo -= valor;

    }
    
    public void desopitar(double valor){
        saldo += valor;
    }

    public void tranferir(double valor,Conta contaDestino){
        this.sacar(valor);
        contaDestino.desopitar(valor);
    }

    public int getNumero(){
        return numero;
    }

    public int getAgencia(){
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfor(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
       }

    
}
