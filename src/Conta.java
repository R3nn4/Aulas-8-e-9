abstract public class Conta {
    //ATRIBUTOS
    protected double saldo = 1.0;

    //METODOS
    public double getSaldo() {
        return saldo;
    }
    public void deposita(double deposito) {
        this.saldo += deposito;
    }
    public void saca(double saque) {
        this.saldo -= saque;
    }
    abstract public void atualiza(double taxa);
}
