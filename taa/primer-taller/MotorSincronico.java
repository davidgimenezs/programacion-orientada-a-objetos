
package aplicacionmotores;
/**
 * @author David Alfredo Gimenez Sanchez - 4822682
 * Ing. Mecatrónica
 */
public class MotorSincronico{
    private String codigo;
    private double potencia;
    private double factorCarga;
    
    public MotorSincronico (String codigo, double potencia, double factorCarga) {
        this.codigo = codigo;
        this.potencia = potencia;
        this.factorCarga = factorCarga;
    }
    
    public double calcularConsumo (double horas){
        return (potencia * horas * factorCarga);
    }

    @Override
    public String toString() {
        return "MotorSincronico{" + "codigo = " + codigo + ", potencia = " + potencia + "kW" + " factorCarga = " + factorCarga + '}';
    }
}
