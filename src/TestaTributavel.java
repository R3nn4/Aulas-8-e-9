public class TestaTributavel {
    public static void main(String[] args) {
        //ATRIBUTOS
        ContaCorrente conta_corrente = new ContaCorrente();
        SeguroDeVida seguro_vida = new SeguroDeVida();
        Atualizador atualizador = new Atualizador(0.2);
        GerenciadorImpostoDeRenda gerenciador = new GerenciadorImpostoDeRenda();

        //METODOS
        conta_corrente.deposita(2800.0);
        seguro_vida.deposita_seguro(1000);

        atualizador.enhanced_atualiza(conta_corrente);

        conta_corrente.calculaTributos();
        seguro_vida.calculaTributos();

        gerenciador.calculaImpostoRenda(conta_corrente.calculaTributos());
        gerenciador.calculaImpostoRenda(seguro_vida.calculaTributos());

        System.out.printf("O saldo total dos tributaveis: %.2f\n\n", gerenciador.getTotal_IR());
    }
}
