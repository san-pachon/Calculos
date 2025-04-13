import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero que quiere elevar al cubo");
        short num1 = leer.nextShort();
        Funcion algoraro = new Funcion();
        algoraro.base=num1;
        short cubo = algoraro.calcularCubo(algoraro.base);
        System.out.println("El cubo del numero que ingreso es: " + cubo);
        System.out.println("Por favor ingrese el valor de uno de los lados del cuadrado");
        int num2 = leer.nextInt();
        algoraro.lado=num2;
        int area1 = algoraro.calcularAreaCuadrado(algoraro.lado);
        System.out.println("El area del cuadrado es: " + area1);
        System.out.println("Por favor ingrese el valor de la base del triangulo");
        short num3 = leer.nextShort();
        System.out.println("Ahora por favor ingrese el valor de la altura del triangulo");
        int num4 = leer.nextInt();
        algoraro.base=num3;
        algoraro.altura=num4;
        double area2 = algoraro.calcularAreaTriangulo(algoraro.base, algoraro.altura);
        System.out.println("El area del triangulo es: " + area2);
        System.out.println("Por favor ingrese el valor de uno de los lados del cubo");
        int num5 = leer.nextInt();
        algoraro.lado=num5;
        int volumen1 = algoraro.volumenCubo(algoraro.lado);
        System.out.println("El volumen del cubo es: " + volumen1);
        System.out.println("Por favor ingrese el valor del radio de la esfera");
        double num6 = leer.nextDouble();
        algoraro.radio=num6;
        double volumen2 = algoraro.volumenEsfera(algoraro.radio);
        System.out.println("El volumen del esfera es: " + volumen2);
        System.out.println("Por favor ingrese el valor del diametro del circulo");
        int num7 = leer.nextInt();
        algoraro.diametro=num7;
        double perimetro1 = algoraro.perimetroCirculo(algoraro.diametro);
        System.out.println("El perimetro del circulo es: " + perimetro1);
        System.out.println("Por favor ingrese el valor de uno de los lados del pentagono");
        int num8 = leer.nextInt();
        algoraro.lado=num8;
        int perimetro2 = algoraro.perimetroPentagono(algoraro.lado);
        System.out.println("El perimetro del pentagono es: " + perimetro2);
    }
}