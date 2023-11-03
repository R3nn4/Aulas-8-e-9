public class Main {
    public static void main(String[] args) {
        /* Resposta questão 1:
        Ao se colocar a classe Conta como abstract, o programa se torna impossível de compilar,
        uma vez que a classe não pode mais ser instanciada.
        */
        ContaCorrente contaC = new ContaCorrente();
        ContaCorrente contaC2 = new ContaCorrente();
        ContaPoupanca contaP = new ContaPoupanca();
        ContaPoupanca contaP2 = new ContaPoupanca();
        Atualizador atualiza_contas = new Atualizador(0.001);
        Banco banco1 = new Banco("Bradesco", "abc123");

        System.out.println("Seja bem vindo ao simulador de contas!");
        System.out.println("Contas serao iniciadas com saldo=1 apenas para propositos de teste e demonstracao");
        System.out.println("A classe Conta foi tambem removida, ao inves de trocada por Conta Corrente, ");
        System.out.println("uma vez que ja haviam duas referencias a essa classe no codigo.\n");

        //Passando as contas para o banco
        banco1.adicionaConta(contaC);
        banco1.adicionaConta(contaC2);
        banco1.adicionaConta(contaP);
        banco1.adicionaConta(contaP2);

        //testando deposito
        contaC.deposita(1000);
        contaP.deposita(1000);

        //testando saque
        contaC.saca(200);
        contaP.saca(200);

        //testando atualização
        for(int i = 0; i < banco1.pegaTotalContas(); i++){
            atualiza_contas.enhanced_atualiza(banco1.pegaConta(i));
        }

        //Imprime infos
        System.out.printf("Saldo da Conta Corrente 1: R$ %.2f \n", contaC.getSaldo());
        System.out.printf("Saldo da Conta Corrente 2: R$ %.2f \n", contaC2.getSaldo());
        System.out.printf("Saldo da Conta Poupanca 1: R$ %.2f \n", contaP.getSaldo());
        System.out.printf("Saldo da Conta Poupanca 2: R$ %.2f \n", contaP2.getSaldo());
        System.out.printf("Saldo total das contas: R$ %.2f \n", atualiza_contas.getSaldoTotal());
    }
}