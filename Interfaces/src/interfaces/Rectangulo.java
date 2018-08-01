package interfaces;

public class Rectangulo implements Figura{
    
    private double lado1;
    private double lado2;
    
    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3){
        double resultadoPerimetro = lado+lado+lado2+lado2;
        return resultadoPerimetro;
    }
    
    @Override
    public double calcularArea(double lado, double lado2){
        double resultado=lado*lado2;
        return resultado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }    
}
