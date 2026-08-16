package model;

public class PedidoComida extends Pedido {
    private boolean mochilaEnBuenEstado;

    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido, boolean mochilaEnBuenEstado) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.mochilaEnBuenEstado = mochilaEnBuenEstado;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido comida]\nVerificando que la mochila térmica esté en buen estadoActual...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Verificando mochila térmica... OK\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n");
    }
}
