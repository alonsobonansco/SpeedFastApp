package model;

public class PedidoEncomienda extends Pedido {
    private double capacidadMaxima;

    public PedidoEncomienda(String idPedido, String direccionEntrega, String tipoPedido, double capacidadMaxima) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido encomienda]\nVerificando que el peso de la encomienda no exceda el límite...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Validando peso y embalaje... OK\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n");
    }
}
