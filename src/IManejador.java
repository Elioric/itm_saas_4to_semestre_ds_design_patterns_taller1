public interface IManejador {

    public void setSiguienteMnj(IManejador siguienteMnj);

    public IManejador getSiguienteMnj();

    public void procesarTransaccion( int cantidad );
}
