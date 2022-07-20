public class Main {
    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercicio retornos:\n");

        double areaQuadrado = Quadrilatero.area(2);
        double areaRetangulo = Quadrilatero.area(2,4);
        double areaTrapezio = Quadrilatero.area(4,2,6);

        System.out.println("Area do quadrado: " + areaQuadrado);
        System.out.println("Area do retangulo: " + areaRetangulo);
        System.out.println("Area do trapezio: " + areaTrapezio);
    
    }
}
