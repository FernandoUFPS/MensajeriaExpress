public abstract class Usuario {

    protected int cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private String direccionResidencia;
    private String ciudad;

    public Usuario(int cedula, String nombre, String apellido, String celular,
                   String email, String direccionResidencia, String ciudad) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        validarCedula();
    }



    public String validarCedula(){

        if (cedula>0 && cedula<2147483647){
            this.cedula=cedula;}
        return ("El número de cédula no es válido, intentalo nuevamente");
    }
    }


