public class Produto {
    //JAVA POSSUI 4 MODIFICADORES DE ACESSO
    //VOU FALAR DE 2: PUBLIC E PRIVATE
    //PRIVATE SÓ PERMITE ACESSO AO ELEMENTO POR DENTRO DA PRÓPRIA CLASSE

    //CAMINHO DAS PEDRAS: TODA CLASSE CRIADA DEVE TER NO MÍNIMO AS 3 CARACTERÍSTICAS ABAIXO:
    //1 - ATRIBUTOS PRIVADOS
    //2 - MÉTODOS GET E SET
    //3 - MÉTODO toString
    private int codigo;
    private String nome;
    private double preco;
    private int qtdEstoque;

    public void registrarEntrada(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade inválida!");
        }else{
            qtdEstoque += qtd;
        }
    }

    public void registrarSaida(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade inválida!");
        }else if(qtd > qtdEstoque){
            System.out.println("Estoque insuficiente!");
        }else{
            qtdEstoque -= qtd;
        }
    }

    //BOTÃO DIREITO / GENERATE / toString
    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: " + preco + " | Código: " + codigo + " | Quantidade: " + qtdEstoque;
    }

    //BOTÃO DIREITO / GENERATE / GETTERS AND SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            System.out.println("Preço inválido!");
        }else {
            this.preco = preco;
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
