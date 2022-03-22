package test;
public class Asiento {
    String color;
    int precio;
    int registro;
    String[] expectedColors = {"rojo", "verde", "amarillo", "negro", "blanco"};
    
    void cambiarColor(String color){
        for (int i=0; i<expectedColors.length; i++) {
            if (color.equals(expectedColors[i])) {
                this.color = color;
            }
        }

    }
}
