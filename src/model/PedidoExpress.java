package model;

public class PedidoExpress extends Pedido {
    private double distanciaDelObjetivo;

    public PedidoExpress(String idPedido, String direccionEntrega, String tipoPedido, double distanciaDelObjetivo) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.distanciaDelObjetivo = distanciaDelObjetivo;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido express]\nVerificando que haya un repartidor cerca del objetivo...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n");
    }
}
