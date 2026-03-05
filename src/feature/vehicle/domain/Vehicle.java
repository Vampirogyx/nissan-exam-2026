package feature.vehicle.domain;

public class Vehicle {
    private String id;
    private String matricula;
    private String color;
    private String modelo;
    private String tipo;

    public Vehicle(String id, String matricula, String color, String modelo, String tipo) {
        this.id = id;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
