public class Cajero {

    IManejador cadena;

    public Cajero() {

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

        cadena = validadorMonto;
    }

    public void retirarDinero(int cantidad) {
        this.cadena.procesarTransaccion(cantidad);
    }

    public static void main(String[] args) throws Exception {

        Cajero cajero = new Cajero();

        cajero.retirarDinero(575000);
        System.out.println("-------------------------");
        cajero.retirarDinero(57000);
        System.out.println("-------------------------");
        cajero.retirarDinero(675000);
        System.out.println("-------------------------");
        cajero.retirarDinero(832000);
        System.out.println("-------------------------");
        cajero.retirarDinero(10000);
        System.out.println("-------------------------");
        cajero.retirarDinero(5000); 
        System.out.println("-------------------------");
        cajero.retirarDinero(0); 
        System.out.println("-------------------------");
    }
}
