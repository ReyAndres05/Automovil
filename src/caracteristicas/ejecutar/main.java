package caracteristicas.ejecutar;

import caracteristicas.Automovil;

public class main {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Ford", 2019, 3.5,
                Automovil.TipoCombustible.Bioetanol,
                Automovil.TipoAutomóvil.Ciudad,
                Automovil.Color.Rojo, 4, 5, 250, 100);

        auto.mostrarInfo();

        auto.setVelActual(100);
        System.out.println("Velocidad actual después de iniciar: "
                + auto.getVelActual() + " km/h");

        auto.acelerar(20);

        auto.desacelerar(50);

        auto.frenar();
    }
}
