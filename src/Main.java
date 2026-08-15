public class Main {
    public static void main(String[] args) {
        Pedido[] pedidos = {
                new PedidoComida(),
                new PedidoEncomienda(),
                new PedidoExpress()
        };

        for (Pedido p : pedidos) {
            p.asignarRepartidor();
        }

        PedidoComida miPedido = new PedidoComida();
        miPedido.asignarRepartidor();
        miPedido.asignarRepartidor("José");
    }
}