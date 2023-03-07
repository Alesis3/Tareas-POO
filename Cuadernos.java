import java.awt.*;

public class Cuadernos {

    private Double tamanio;
    private String tipo;
    private String marca;
    private Color color;

    public Cuadernos() {
    }

    public Cuadernos(Double tamanio, String tipo, String marca, Color color) {
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
