package model;

public class PedidoComida extends Pedido {
    private boolean mochilaEnBuenEstado;

    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido, boolean mochilaEnBuenEstado) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.mochilaEnBuenEstado = mochilaEnBuenEstado;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido comida]\nVerificando que la mochila térmica esté en buen estado...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        if (!mochilaEnBuenEstado) {
            System.out.println("→ [ERROR] Mochila térmica en mal estado. No es posible realizar un pedido de comida.\n\n");
            return;
        }

        System.out.println("→ Mochila térmica [OK]\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n\n");
    }

    public boolean isMochilaEnBuenEstado() {
        return mochilaEnBuenEstado;
    }

    public void setMochilaEnBuenEstado(boolean mochilaEnBuenEstado) {
        this.mochilaEnBuenEstado = mochilaEnBuenEstado;
    }
}
