public class GerenciadorImpostoDeRenda {
    //ATRIBUTOS
    private double total_IR = 0;

    //METODOS
    protected void calculaImpostoRenda(Tributavel tributavel){
        total_IR += tributavel.calculaTributos();
    }

    public double getTotal_IR(){
        return this.total_IR;
    }
}
