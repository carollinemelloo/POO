public class Equipamento extends ItemEstoque {

    public Equipamento(String nome, int quantidade, String validade) {
        super(nome, quantidade, validade);
    }

    @Override
    public String getCategoria() {
        return "Equipamento";
    }
}
