import java.time.LocalDateTime;

public class Movimentacao {
    private String tipo; 
    private String item;
    private int quantidade;
    private LocalDateTime dataHora;

    public Movimentacao(String tipo, String item, int quantidade) {
        this.tipo = tipo;
        this.item = item;
        this.quantidade = quantidade;
        this.dataHora = LocalDateTime.now();
    }

    public String toString() {
        return tipo + " - " + item + " (" + quantidade + " unidades) em " + dataHora;
    }
}
