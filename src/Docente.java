public class Docente extends Materia {

    public Docente() {
    }

    public String notaEstudiante(){
        String detalle = "";
        Materia materia = new Materia();
        if(materia.getKey().equals(key)){
            detalle = materia.getKey() + "\n" + materia.getNombre() + "\n" + materia.getNota();
        }
        return detalle;
    }

    public String Vernotas(){

    }

    public String  verDatos(){

    }
}
