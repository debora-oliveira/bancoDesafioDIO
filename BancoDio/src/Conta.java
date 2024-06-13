

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 201;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void exibirDados(){
        System.out.println("Titular: "+this.cliente.getNome());
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
