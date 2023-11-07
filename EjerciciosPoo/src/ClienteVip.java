public class ClienteVip {
    private String nombre;
    private double limiteCredito;
    private String correoElectronico;

    public ClienteVip(String nombre, double limiteCredito, String correoElectronico) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.correoElectronico = correoElectronico;
    }

    public ClienteVip(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, null);
    }

    public ClienteVip() {
        this(null, 0, null);
    }

    public String getNombre() {
        return nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}