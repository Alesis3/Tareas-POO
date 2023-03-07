public class Persona {

    private Double  estatura;
    private String sexo;

    private Double edad;

    private String nombre;

    public Persona() {
    }

    public Persona(Double estatura, String sexo, Double edad, String nombre) {
        this.estatura = estatura;
        this.sexo = sexo;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
