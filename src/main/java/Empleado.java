 public class Empleado {

        String nombre;
        String cedula;
        int edad;
        boolean casado;
        double salario;

        Empleado(){
        }

        Empleado(String nombre, String cedula, int edad, boolean casado, double salario)  {
            this.nombre = nombre;
            this.cedula = cedula;
            this.edad = edad;
            this.casado = casado;
            this.salario = salario;

        }

        public String Clasificacion(){
            String c="";
            if (edad <= 21){
                c = "Principiante";
            }
            if ((edad >=22) & (edad <= 35)){
                c = "Intermedio";
            }
            if (edad > 35){
                c = "Senior";
            }
            return c;
        }

        public void ImprimirEmpleado(){
            System.out.println(this.nombre);
            System.out.println(this.cedula);
            System.out.println(this.edad);
            if (casado) {
                System.out.println("Casado");
            }
            else
            {
                System.out.println("Soltero");
            }
            System.out.println(this.salario);
        }

        public void AumentarSalario(double incremento){
            salario = salario * (1 + incremento);
        }

    }

    class Programador extends Empleado{
        int lineasDeCodigoPorHora;
        String lenguajeDominante;

        Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){

            super.nombre = nombre;
            super.cedula = cedula;
            super.edad = edad;
            super.casado = casado;
            super.salario = salario;
            this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
            this.lenguajeDominante = lenguajeDominante;
        }

        Programador(){
        }

    }

    public class ExamnIPM {

        public static void main(String[] args){
            Empleado e = new Empleado("Orlando Arróliga","12345",17,true,2000);
            Programador p1 = new Programador("Flavio","3456",20,false,1000,123,"Visual Basic");
            p1.nombre = "Flavio";
            p1.salario = 1000;
            p1.AumentarSalario(0.25);
            p1.ImprimirEmpleado();
        }

}
