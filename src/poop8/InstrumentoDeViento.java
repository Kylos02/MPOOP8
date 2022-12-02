package poop8;

public class InstrumentoDeViento extends Object implements InstrumentoMusical{

    public InstrumentoDeViento() {
    }

    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void afinar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String TipoDeInstrumento() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return "InstrumentoDeViento{" + '}';
    }
    
    
}
