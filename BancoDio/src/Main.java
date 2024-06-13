public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("BANCO DIO");
       System.out.println(banco.getNome()+":::::::::::::::::::");

        Cliente c1 = new Cliente();
        c1.setNome("Debora");
        Cliente c2 = new Cliente();
        c2.setNome("Ana");


        Conta cc1 = new ContaCorrente(c1);
        cc1.depositar(200);
        Conta cp1 = new ContaPoupanca(c1);
        cc1.transferir(100,cp1);
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();



    }
}