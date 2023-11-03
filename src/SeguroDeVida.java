public class SeguroDeVida implements Tributavel{
    //ATRIBUTOS
    private double saldo_seguro = 0;
    private final double taxa = 42;

    //METODOS
    public double getSaldo_seguro() {
        return saldo_seguro;
    }
    public void deposita_seguro (double deposito) {
        this.saldo_seguro += deposito;
    }
    @Override
    public double calculaTributos() {
        saldo_seguro -= taxa;
        return taxa;
    }
}
