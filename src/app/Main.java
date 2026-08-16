package app;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {
    public static void main(String[] args) {
        Pedido[] pedidos = {
                new PedidoComida("001", "calle123", "Comida", true),
                new PedidoEncomienda("002", "calle456", "Encomienda", 60),
                new PedidoExpress("003", "calle789", "Express", 100)
        };

        for (Pedido p : pedidos) {
            p.asignarRepartidor();
        }

        //PedidoComida miPedido = new PedidoComida();
       // miPedido.asignarRepartidor();
        //miPedido.asignarRepartidor("José");
    }
}