package ejercicio19_cap;

public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    public String mostrarDatos() {
        return String.format("Perímetro: %.2f\nAltura: %.2f\nÁrea: %.2f",
                             calcularPerimetro(), calcularAltura(), calcularArea());
    }
}
