package poop8;

public class POOP8 {

    public static void main(String[] args) {
        //Poligono poligono = new Poligono();
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Poligono poligono = new Cuadrilatero();
        System.out.println("" + poligono + cuadrilatero + triangulo);
        
        InstrumentoMusical instrumento = new InstrumentoDeViento();
        System.out.println(instrumento);
        
        System.out.println(Math.PI);
        System.out.println(Meses.DOS);
    }
}
