package app;

import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {
    public static void main(String[] args) {
        PedidoComida comida = new PedidoComida(
                "001", "calle123", "Comida", true);
        PedidoEncomienda encomienda = new PedidoEncomienda(
                "002", "calle456", "Encomienda", 28);
        PedidoExpress express = new PedidoExpress(
                "003", "calle789", "Express", 55);

        comida.asignarRepartidor();
        comida.asignarRepartidor("Carlos");

        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("José");

        express.asignarRepartidor();
        express.asignarRepartidor("Jaime");
    }
}