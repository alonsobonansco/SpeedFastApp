public class PedidoComida extends Pedido {

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido comida]\nAsignando repartidor...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Verificando mochila térmica... OK\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n");
    }
}
