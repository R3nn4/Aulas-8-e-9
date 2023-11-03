public class ContaCorrente extends Conta implements Tributavel {
    //ATRIBUTOS
    private final double taxa_deposito = 0.1;
    private final int multiplicador = 2;

    //METODOS
    @Override
    public void deposita(double deposito) {
        this.saldo += (deposito - taxa_deposito);
    }
    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa * multiplicador);
    }

    @Override
    public double calculaTributos() {
        this.saldo -= (this.saldo * 0.01);
        return this.saldo;
    }
}
