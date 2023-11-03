public class ContaPoupanca extends Conta{
    //ATRIBUTOS
    private final int multiplicador = 3;
    //METODOS
    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa * multiplicador);
    }
}
