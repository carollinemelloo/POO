public abstract class ItemEstoque {
    protected String nome;
    protected int quantidade;
    protected String validade;

    public ItemEstoque(String nome, int quantidade, String validade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public abstract String getCategoria();
}
