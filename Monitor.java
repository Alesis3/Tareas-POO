import java.awt.*;

public class Monitor {

    private String marca;

    private Double pulgadas;

    private Color color;

    public Monitor()
    {
    }

    public Monitor(String marca, Double pulgadas, Color color) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
