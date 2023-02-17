import java.util.Date;

public class Envio {

    String numeroGuia;
    Cliente cliente;
    String StringciudadOrigen;
    String ciudadDestino;
    String direccionDestino;
    String nombrePersonaRecibe;
    String celularPersonaRecibe;
    Date horaEntrega;
    String estadoEnvio;
    Paquete paquete;

    public Envio(String numeroGuia, Cliente cliente, String stringciudadOrigen, String ciudadDestino, String direccionDestino, String nombrePersonaRecibe,
                 String celularPersonaRecibe, Date horaEntrega, String estadoEnvio, Paquete paquete) {

        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        StringciudadOrigen = stringciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombrePersonaRecibe = nombrePersonaRecibe;
        this.celularPersonaRecibe = celularPersonaRecibe;
        this.horaEntrega = horaEntrega;
        this.estadoEnvio = estadoEnvio;
        this.paquete = paquete;
        asignarEstadoEnvio();
    }

    public String asignarEstadoEnvio(){

        switch (estadoEnvio){
            case "Recibido":
                this.estadoEnvio = "Recibido";
                break;
            case "En Ruta":
                this.estadoEnvio = "En Ruta";
                break;
            case "Entregado":
                this.estadoEnvio = "Entregado";
                break;
            default:
        }
        return "El tipo de paquete no es válido";

    }
}
