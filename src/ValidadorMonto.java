public class ValidadorMonto extends AbstractManejador {

    @Override
    public void procesarTransaccion(int cantidad) {
        // Validamos si la cantidad es múltiplo de 5000
        if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad ingresada debe ser múltiplo de 5000. Cantidad ingresada: $" + cantidad);
            return; // Detiene la cadena si la validación falla
        } else if (cantidad <= 0) {
            System.out.println("Error: No se puede procesar el monto específicado. Debe ser mayor que cero (0).");
        } else if (this.getSiguienteMnj() != null) { // Si la cantidad es válida y hay un siguiente manejador, pasamos la transacción
            System.out.println("Se dispensará el monto: $" + cantidad);
            this.getSiguienteMnj().procesarTransaccion(cantidad);
        } 
     }
}