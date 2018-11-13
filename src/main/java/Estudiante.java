import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int ci, int edad){
        super(nombre, apellido, ci, edad);
        this.materias = new ArrayList<>();
    }

    public String getMateria(String key){
        String nombre = "";
        for (Materia m: materias) {
            if (m.getKey().equals(key)){
                nombre = m.getNombre();
                break;
            }
        }
        return nombre;
    }


    public
}
