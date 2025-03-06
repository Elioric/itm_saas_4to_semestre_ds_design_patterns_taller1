// La clase abstracta Manejador permite una plantilla de los
// metodos y atributos comunes en cada clase concreta

public abstract class AbstractManejador implements IManejador{

    private IManejador siguienteMnj; //permite que cada manejador conozca quién es su sucesor en la cadena.

    // almacena el siguiente manejador en la cadena de responsabilidades
    // comun a todas las clases manejador
    public void setSiguienteMnj(IManejador siguienteMnj) {
        this.siguienteMnj = siguienteMnj;
    }

    // retorna el manejador sucesor de la cadena
    public IManejador getSiguienteMnj() {
        return siguienteMnj;
    }

    // metodo abstracto para procesar la transaccion del cliente
    // es implementado en cada clase concreta
    abstract public void procesarTransaccion(int cantidad);
    
}