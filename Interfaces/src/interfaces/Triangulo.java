
package interfaces;


public class Triangulo implements Figura{
    
    private double b;
    private double h;
   
    
    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3){
        double resultadoPerimetro = lado+lado2+lado3;
        return resultadoPerimetro;
    }
    @Override
    public double calcularArea(double b, double h){
        double resultado=(b*h)/2;
        
        return resultado;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }    
}
