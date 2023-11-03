//mudar isso tudo depois
public class Atualizador {
    //ATRIBUTOS
    private double saldoTotal = 0;
    private double selic;

    //METODOS
    public Atualizador(double taxa){
        this.selic = taxa;
    }
    public void enhanced_atualiza(Conta conta){
        System.out.println("Saldo antigo: R$ " + conta.getSaldo());
        conta.atualiza(selic);
        System.out.println("Novo saldo: R$ " + conta.getSaldo());
        System.out.println();

        this.saldoTotal += conta.getSaldo();
    }

    public double getSaldoTotal(){
        return this.saldoTotal;
    }
}
