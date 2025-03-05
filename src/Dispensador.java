
public class Dispensador extends AbstractManejador {

    private int denominacion;

    public Dispensador(int denominacion) {
        super();
        this.denominacion = denominacion; // define la denominacion del billete que manejara cada objeto dispensador
    }

    @Override
    public void procesarTransaccion(int cantidad) {

        // Calcular la cantidad de billetes a dispensar y calculamos el restante
        int numEfectivo = cantidad / denominacion;
        int restante = cantidad % denominacion;

        if(numEfectivo > 0){
            System.out.println("Dispensando " + numEfectivo + " billete(s) de $" + denominacion);
        }

        if (restante > 0 && this.getSiguienteMnj() != null) {
            this.getSiguienteMnj().procesarTransaccion(restante); // pasamos el restante de la cantidad al siguiente manejador
        }    
    }
}
