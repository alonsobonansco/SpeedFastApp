package model;

public class PedidoEncomienda extends Pedido {
    private static final double CAPACIDAD_MAXIMA = 60;
    private double pesoEncomienda;

    public PedidoEncomienda(String idPedido, String direccionEntrega, String tipoPedido, double pesoEncomienda) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.pesoEncomienda = pesoEncomienda;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido encomienda]\nVerificando que el peso de la encomienda no exceda el límite...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        if (pesoEncomienda > CAPACIDAD_MAXIMA) {
            System.out.println("→ [ERROR] El peso de la encomienda supera el límite permitido. No es posible realizar la encomienda.\n\n");
            return;
        }

        System.out.println("→ Peso de la encomienda [OK]\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n\n");
    }

    public double getPesoEncomienda() {
        return pesoEncomienda;
    }

    public void setPesoEncomienda(double pesoEncomienda) {
        this.pesoEncomienda = pesoEncomienda;
    }
}
