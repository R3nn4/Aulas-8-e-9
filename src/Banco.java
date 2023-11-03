class Banco{
    //ATRIBUTOS
    private String nome;
    private final int max_contas = 10;
    private Conta [] contas = new Conta[max_contas];
    private String cnpj;
    private int num_contas = 0;


    //METODOS
    public Banco (String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public void adicionaConta (Conta conta_atual){

        if(num_contas < max_contas) {
            this.contas[num_contas] = conta_atual;
            num_contas++;
        }else{
            System.out.println("Numero maximo de contas atingido");
        }
    }
    public Conta pegaConta(int posicao){
        return this.contas[posicao];
    }
    public int pegaTotalContas(){
        return this.num_contas;
    }

    //Gets
    public String getNome() {
        return nome;
    }
    public String getCnpj() {
        return cnpj;
    }

    //Sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}