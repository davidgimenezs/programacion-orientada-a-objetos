package aplicacionmotores;

/**
 * @author David Alfredo Gimenez Sanchez - 4822682
 * Ing. Mecatrónica
 */

public class AplicacionMotores {
    
    public static void main(String[] args){
        MotorInduccion MI1 = new MotorInduccion("1", 1);
        MotorInduccion MI2 = new MotorInduccion("2", 1);
        MotorSincronico MS1 = new MotorSincronico("3", 1, 1);
        MotorSincronico MS2 = new MotorSincronico("4", 1, 1);
        
            System.out.println(MI1.toString () + " Consumo en 5 horas es: " + MI1.calcularConsumo(5));
            System.out.println(MI2.toString () + " Consumo en 5 horas es: " + MI2.calcularConsumo(5));
            System.out.println(MS1.toString () + " Consumo en 5 horas es: " + MS1.calcularConsumo(5));
            System.out.println(MS2.toString () + " Consumo en 5 horas es: " + MS2.calcularConsumo(5));
        
    }
}
