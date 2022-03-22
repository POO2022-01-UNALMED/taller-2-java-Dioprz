package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int nasientos = 0;
        for (int i=0; i < asientos.length; i++){
            if(asientos[i].getClass() == Asiento.class){
                nasientos++;
            }
        }
        return nasientos;
    }
    
    String verificarIntegridad() {
        if (registro != motor.registro) {
            return "Las piezas no son originales";
        }
        for (int i=0; i<asientos.length; i++){
            if(asientos[i].getClass() != Asiento.class){
                continue;
            }
            if (asientos[i].registro != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}



                

         
