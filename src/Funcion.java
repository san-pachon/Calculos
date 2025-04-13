public class Funcion{
    //Atributos para nuestro ejemplo
    int lado;
    double radio;
    short base;
    int altura;
    int diametro;
    //Metodos para nuestro ejemplo
    public short calcularCubo(short base){
        return (short) (base*base*base);
    }
    public int calcularAreaCuadrado(int lado){
        return (int) (lado*lado);
    }
    public double calcularAreaTriangulo(short base, int altura){
        return (double) ((base*altura)/2);
    }
    public int volumenCubo(int lado){
        return (int) (lado*lado*lado);
    }
    public double volumenEsfera(double radio){
        double pi = 3.1416;
        return (double) (pi*(4/3)*(radio*radio*radio));
    }
    public double perimetroCirculo(int diametro){
        double pi = 3.1416;
        return (double) (pi*diametro);
    }
    public int perimetroPentagono(int lado){
        return (int) (lado*5);
    }
}
