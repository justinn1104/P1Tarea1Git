package Ejercicios;
import java.util.Scanner;
public class CirculoMendoza {
    Scanner cin = new Scanner(System.in);
    private float radioMendoza;

    public CirculoMendoza(float radioMendoza) {
        this.radioMendoza = radioMendoza;
    }

    public float getRadioMendoza() {
        return radioMendoza;
    }

    public void setRadioMendoza(float radioMendoza) {
        this.radioMendoza = radioMendoza;
    }
    
    public float AreaMendoza(){
        float area = (float) (Math.PI*Math.pow(radioMendoza, 2));
        return area;
    }
    
    public void datosMendoza(){
        System.out.println("\n\nCirculo"
                +"\nFormula Pi*r^2=A"
                +"\nRadio: "+getRadioMendoza()
                +"\nArea: "+ AreaMendoza());
    };
    
    public void insertarDatosMendoza(){
        System.out.println("Igresa el radio para el circulo: [r>0]");
        setRadioMendoza(cin.nextFloat());
        while(getRadioMendoza()<=0){
            System.out.println("Vuelve a igresar el radio para el circulo: [r>0]");
            setRadioMendoza(cin.nextFloat());
        }
    };
    
}
