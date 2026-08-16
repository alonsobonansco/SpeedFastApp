package model;

public class PedidoExpress extends Pedido {
    private static final double LIMITE_DISTANCIA_KM = 100;
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
        if (distanciaDelObjetivo > LIMITE_DISTANCIA_KM) {
            System.out.println("→ [ERROR] El repartidor se encuentra lejos del objetivo. No es posible realizar el envío express.\n\n");
            return;
        }

        System.out.println("→ Repartidor cerca y con disponibilidad inmediata [OK]\n"
                        +  "→ Pedido asignado a " + nombreRepartidor + "\n\n");
    }

    public double getDistanciaDelObjetivo() {
        return distanciaDelObjetivo;
    }

    public void setDistanciaDelObjetivo(double distanciaDelObjetivo) {
        this.distanciaDelObjetivo = distanciaDelObjetivo;
    }
}
