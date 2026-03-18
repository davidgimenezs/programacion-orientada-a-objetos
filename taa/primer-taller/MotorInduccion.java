package aplicacionmotores;

/** 
 * @author David Alfredo Gimenez Sanchez - 4822682
 * Ing. Mecatrónica
 */

public class MotorInduccion{
    private String codigo;
    private double potencia;
    
    public MotorInduccion (String codigo, double potencia) {
        this.codigo = codigo;
        this.potencia = potencia;
    }
    
    public double calcularConsumo (double horas){
        return (potencia*horas);
    }

    @Override
    public String toString() {
        return "MotorInduccion{" + "codigo = " + codigo + ", potencia = " + potencia + " kW" + '}';
    }
}
