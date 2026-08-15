public class PedidoEncomienda extends Pedido {

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido encomienda]\nAsignando repartidor...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Validando peso y embalaje... OK\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n");
    }
}
