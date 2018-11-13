public class Materia {
    private String key;
    private String nombre;
    private int nota;

    public Materia(String key, String nombre, int nota) {
        this.key = key;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
