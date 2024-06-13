public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        renderPoupanca();
        super.exibirDados();
    }

    void renderPoupanca(){
        super.saldo += (saldo * 0.2);
    }
}
