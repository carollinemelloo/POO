public class Medicamento extends ItemEstoque {

    public Medicamento(String nome, int quantidade, String validade) {
        super(nome, quantidade, validade);
    }

    @Override
    public String getCategoria() {
        return "Medicamento";
    }
}
