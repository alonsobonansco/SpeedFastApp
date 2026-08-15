public class PedidoExpress extends Pedido {

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido express]\nAsignando repartidor...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n");
    }
}
