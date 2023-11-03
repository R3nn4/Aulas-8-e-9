public class GerenciadorImpostoDeRenda {
    //ATRIBUTOS
    private double total_IR = 0;

    //METODOS
    /*Não ficou claro se o total_IR deveria ser a soma dos saldos dos tributaveis em si
    ou se deveria ser a soma do valor cobrado deles pelo Imposto de Renda, então eu
    decidi deixá-lo como este último: a soma dos valores cobrados. As alterações em si
    estão nos arquivos da ContaCorrente e do Seguro de Vida, mas achei pertinente deixar a
    mensagem aqui por ser pra onde os valores dos tributos vêm.*/
    
    protected void calculaImpostoRenda(Tributavel tributavel){
        total_IR += tributavel.calculaTributos();
    }

    public double getTotal_IR(){
        return this.total_IR;
    }
}
