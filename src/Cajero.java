public class Cajero {
    public static void main(String[] args) throws Exception {

        IManejador validadorMonto = new ValidadorMonto();
        IManejador dispensador100 = new Dispensador(100000);
        IManejador dispensador50 = new Dispensador(50000);
        IManejador dispensador20 = new Dispensador(20000);
        IManejador dispensador10 = new Dispensador(10000);
        IManejador dispensador5 = new Dispensador(5000);

        validadorMonto.setSiguienteMnj(dispensador100);
        dispensador100.setSiguienteMnj(dispensador50);
        dispensador50.setSiguienteMnj(dispensador20);
        dispensador20.setSiguienteMnj(dispensador10);
        dispensador10.setSiguienteMnj(dispensador5);

        validadorMonto.procesarTransaccion(575000);
        System.out.println("-------------------------");
        validadorMonto.procesarTransaccion(57000);
        System.out.println("-------------------------");
        validadorMonto.procesarTransaccion(675000);
        System.out.println("-------------------------");
        validadorMonto.procesarTransaccion(832000);
        System.out.println("-------------------------");
        validadorMonto.procesarTransaccion(10000);
        System.out.println("-------------------------");
        validadorMonto.procesarTransaccion(5000); 
        System.out.println("-------------------------");
        validadorMonto.procesarTransaccion(0); 
    }
}
