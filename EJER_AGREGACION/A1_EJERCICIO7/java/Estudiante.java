package A_1;

public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre);
    }
}

