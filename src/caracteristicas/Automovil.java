package caracteristicas;

public class Automovil {

    private String marca;
    private int modelo;
    private double motor;

    public enum TipoCombustible {
        Gasolina, Bioetanol, Diélse, biodiésel, Gas_Natural
    }
    public TipoCombustible tipocombustible;

    public enum TipoAutomóvil {
        Ciudad, Subcompacto, Compacto, Familiar, Ejecutivo, SUV
    }
    public TipoAutomóvil tipoautomovil;

    public enum Color {
        Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta
    }
    public Color color;

    private int numPuertas;
    private int cantAsientos;
    private double velMáxima;
    private double velActual;

    public Automovil(String marca, int modelo, double motor,
            TipoCombustible tipocombustible, TipoAutomóvil tipoautomovil,
            Color color, int numPuertas, int cantAsientos, double velMáxima,
            double velActual) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipocombustible = tipocombustible;
        this.tipoautomovil = tipoautomovil;
        this.color = color;
        this.numPuertas = numPuertas;
        this.cantAsientos = cantAsientos;
        this.velMáxima = velMáxima;
        this.velActual = velActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(TipoCombustible tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public TipoAutomóvil getTipoautomovil() {
        return tipoautomovil;
    }

    public void setTipoautomovil(TipoAutomóvil tipoautomovil) {
        this.tipoautomovil = tipoautomovil;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public double getVelMáxima() {
        return velMáxima;
    }

    public void setVelMáxima(double velMáxima) {
        this.velMáxima = velMáxima;
    }

    public double getVelActual() {
        return velActual;
    }

    public void setVelActual(double velActual) {
        this.velActual = velActual;
    }

    public void acelerar(double incremento) {
        if (velActual + incremento < velMáxima) {
            velActual = velActual + incremento;
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad "
                    + "máxima");
        }
        System.out.println("Velocidad actual: " + velActual + "Km/h");
    }

    public void desacelerar(double decremento) {
        if (velActual - decremento > 0) {
            velActual = velActual - decremento;
        } else {
            System.out.println("No se puede desacelerar a una velocidad"
                    + " negativa");
            velActual = 0;
        }
        System.out.println("Velocidad actual: " + velActual + "Km/h");
    }

    public void frenar() {
        velActual = 0;
        System.out.println("El automóvil ha frenado. Velocidad actual: "
                + velActual + "Km/h");
    }

    public double TiempoEstimadoLlegada(double distancia) {
        return distancia / velActual;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("Tipo de Combustible: " + tipocombustible);
        System.out.println("Tipo de Automóvil: " + tipoautomovil);
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Cantidad de asientos: " + cantAsientos);
        System.out.println("Velocidad máxima: " + velMáxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velActual + " km/h");
    }
}
