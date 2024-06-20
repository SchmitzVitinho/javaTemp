import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<Pedido> fila = new LinkedList<>();

        // Adicionando alguns pedidos à fila
        fila.add(new Milkshake(1, "Grande", "Chocolate"));
        fila.add(new Livro(2, "Dom Casmurro"));
        fila.add(new Milkshake(3, "Médio", "Morango"));
        fila.add(new Livro(4, "A Revolução dos Bichos"));

        // Criando colaboradores
        Colaborador junior = new Junior();
        Colaborador pleno = new Pleno();
        Colaborador senior = new Senior();

        // Simulando atendimento dos pedidos
        while (!fila.isEmpty()) {
            junior.atenderPedido(fila);
            pleno.atenderPedido(fila);
            senior.atenderPedido(fila);
        }

    }
}