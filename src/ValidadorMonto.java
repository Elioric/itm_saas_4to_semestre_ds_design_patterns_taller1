public class ValidadorMonto extends AbstractManejador {

    @Override
    public void procesarTransaccion(int cantidad) {

        System.out.println("Monto solicitado: $" + cantidad);

        // Validamos si la cantidad es múltiplo de 5000
        if (cantidad <= 0) {
            System.out.println("Error: No se puede procesar el monto especificado. Debe ser mayor que cero (0).");
        } else if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad ingresada debe ser múltiplo de 5000.");
        } else if (this.getSiguienteMnj() != null) { // Si la cantidad es válida y hay un siguiente manejador, pasamos la transacción
            this.getSiguienteMnj().procesarTransaccion(cantidad);
        } 
     }
}