public class Empleado extends Usuario{

    String antiguedadEmpresa;
    String rh;
    String tipoEmpleado;

    public Empleado (int cedula, String nombre, String apellido, String celular, String email,
                     String direccionResidencia, String ciudad, String antiguedadEmpresa, String rh,
                     String tipoEmpleado) {

        super(cedula, nombre, apellido, celular, email, direccionResidencia, ciudad);

        this.antiguedadEmpresa = antiguedadEmpresa;
        this.tipoEmpleado = tipoEmpleado;
        this.rh = rh;
        asignarTipoEmpleado();
    }



        public String asignarTipoEmpleado(){

            switch (tipoEmpleado){
                case "Conductor":
                    tipoEmpleado = "Conductor";
                    break;
                case "Repartidor":
                    tipoEmpleado = "Repartidor";
                    break;
                case "Coordinador":
                    tipoEmpleado = "Coordinador";
                    break;
                default:
            }
            return "El tipo de empleado no es válido";

    }}
