public class App {
    public static void main(String[] args) throws Exception {
Estoque estoque = new Estoque();


        Medicamento m1 = new Medicamento("Paracetamol", 100, "2025-10");
        Medicamento m2 = new Medicamento("Dipirona", 150, "2026-03");
        Medicamento m3 = new Medicamento("Amoxicilina", 80, "2024-12");


        Equipamento e1 = new Equipamento("Seringa", 200, "2026-01");
        Equipamento e2 = new Equipamento("Luvas Cirúrgicas", 300, "2025-07");


        estoque.adicionarItem(m1);
        estoque.adicionarItem(m2);
        estoque.adicionarItem(m3);
        estoque.adicionarItem(e1);
        estoque.adicionarItem(e2);


        estoque.removerItem("Paracetamol", 30);
        estoque.removerItem("Seringa", 50);
        estoque.removerItem("Luvas Cirúrgicas", 100);


        boolean sucesso = estoque.removerItem("Amoxicilina", 100);
        if (!sucesso) {
            System.out.println("Falha ao remover: quantidade insuficiente de Amoxicilina.");
        }


        boolean existe = estoque.removerItem("Bisturi", 10);
        if (!existe) {
            System.out.println("Falha ao remover: item 'Bisturi' não encontrado no estoque.");
        }


        System.out.println("\n=== Itens Atuais no Estoque ===");
        estoque.listarItens();

        System.out.println("\n=== Histórico de Movimentações ===");
        estoque.listarHistorico();
    }
}
