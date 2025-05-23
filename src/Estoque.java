import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itens;
    private ArrayList<Movimentacao> historico;

    public Estoque() {
        itens = new ArrayList<>();
        historico = new ArrayList<>();
    }

    public void adicionarItem(ItemEstoque item) {
        itens.add(item);
        historico.add(new Movimentacao("Entrada", item.getNome(), item.getQuantidade()));
    }

    public boolean removerItem(String nome, int quantidade) {
        for (ItemEstoque item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                boolean sucesso = item.removerEstoque(quantidade);
                if (sucesso) {
                    historico.add(new Movimentacao("Saída", nome, quantidade));
                    return true;
                }
            }
        }
        return false;
    }

    public void listarItens() {
        for (ItemEstoque item : itens) {
            System.out.println(item.getCategoria() + ": " + item.getNome() + " - " + item.getQuantidade() + " unidades - Validade: " + item.getValidade());
        }
    }

    public void listarHistorico() {
        for (Movimentacao m : historico) {
            System.out.println(m);
        }
    }
}
