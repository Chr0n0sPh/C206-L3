public class Calculadora {
    private static float pi = 3.14f;

    public double circunferencia(double radio){
        return (2*pi*radio);
    }

    public double volumeEsfera(double raio){
        return (1.33*pi*raio*raio*raio);
    }

    public double volumeCilindro(double raio, double altura){
        return (pi*raio*raio*altura);
    }
}
