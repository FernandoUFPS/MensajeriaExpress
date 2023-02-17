public class Paquete {

    String idPaquete;
    String tipoPaquete;
    double peso;
    double valorDeclarado;

    public Paquete(String idPaquete, String tipoPaquete, double peso, double valorDeclarado) {
        this.idPaquete = idPaquete;
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
        asignarTipoPaquete();
    }

    public String asignarTipoPaquete(){

        switch (tipoPaquete){
            case "Liviano":
                this.tipoPaquete="Liviano";
                break;
            case "Mediano":
                this.tipoPaquete = "Mediano";
                break;
            case "Grande":
                this.tipoPaquete = "Grande";
                break;
            default:
        }
        return "El tipo de paquete no es válido";

    }
}
