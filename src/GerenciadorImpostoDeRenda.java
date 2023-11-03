public class GerenciadorImpostoDeRenda {
    //ATRIBUTOS
    private double total_IR = 0;

    //METODOS
    protected void calculaImpostoRenda(double valor){
        total_IR += valor;
    }

    public double getTotal_IR(){
        return this.total_IR;
    }
}
