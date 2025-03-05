public class ValidadorMonto extends AbstractManejador {

    @Override
    public void procesarTransaccion(int cantidad) {
        // Validamos si la cantidad es múltiplo de 5000
        if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad ingresada debe ser múltiplo de 5000.");
            return; // Detiene la cadena si la validación falla
        }

        // Si la cantidad es válida y hay un siguiente manejador, pasamos la transacción
        if (this.getSiguienteMnj() != null) {
             this.getSiguienteMnj().procesarTransaccion(cantidad);
         }      
     }
}