public class MaquinaDeCafe {
    private int cantidadAgua;
    private int cantidadCafe;
    private int cantidadCrema;
    private int cantidadVasos;
    private int capacidadVasos;

    public MaquinaDeCafe() {
    }

    public MaquinaDeCafe(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasos, int capacidadVasos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasos = cantidadVasos;
        this.capacidadVasos = capacidadVasos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        cantidadAgua=5000;
        if(cantidadAgua > 0 && cantidadAgua<=5000){


        }

        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        if(cantidadCafe>0 && cantidadCafe<=1000)
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        if(cantidadCrema>0 && cantidadCrema<=1500)
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        if(cantidadVasos > 0 && cantidadVasos<=50)
        this.cantidadVasos = cantidadVasos;
    }

    public int getCapacidadVasos() {
        return capacidadVasos;
    }

    public void setCapacidadVasos(int capacidadVasos) {
        if(capacidadVasos > 0 && capacidadVasos <= 200)
        this.capacidadVasos = capacidadVasos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafe=" + cantidadCafe +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVasos=" + cantidadVasos +
                ", capacidadVasos=" + capacidadVasos +
                '}';
    }

}
