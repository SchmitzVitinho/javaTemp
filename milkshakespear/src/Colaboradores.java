import java.util.LinkedList;
import java.util.Queue;

// Interface para os colaboradores
interface Colaborador {
    void atenderPedido(Queue<Pedido> fila);
}

// Colaborador Junior - atende pedidos de Milkshake
class Junior implements Colaborador {
    @Override
    public void atenderPedido(Queue<Pedido> fila) {
        if (!fila.isEmpty() && fila.peek() instanceof Milkshake) {
            Pedido pedido = fila.poll();
            System.out.println("Junior atendendo pedido de Milkshake número " + pedido.getNumero());
        }
    }
}

// Colaborador Pleno - atende pedidos de Livro
class Pleno implements Colaborador {
    @Override
    public void atenderPedido(Queue<Pedido> fila) {
        if (!fila.isEmpty() && fila.peek() instanceof Livro) {
            Pedido pedido = fila.poll();
            System.out.println("Pleno atendendo pedido de Livro número " + pedido.getNumero());
        }
    }
}

// Colaborador Senior - atende qualquer tipo de pedido
class Senior implements Colaborador {
    @Override
    public void atenderPedido(Queue<Pedido> fila) {
        if (!fila.isEmpty()) {
            Pedido pedido = fila.poll();
            if (pedido instanceof Milkshake) {
                System.out.println("Senior atendendo pedido de Milkshake número " + pedido.getNumero());
            } else if (pedido instanceof Livro) {
                System.out.println("Senior atendendo pedido de Livro número " + pedido.getNumero());
            }
        }
    }
}