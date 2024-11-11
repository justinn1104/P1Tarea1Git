package Ejercicios;
import java.util.Scanner;
public class TrianguloMendoza {
    Scanner cin = new Scanner(System.in);
    
    private float baseMendoza, alturaMendoza;

    public TrianguloMendoza(float baseMendoza, float alturaMendoza) {
        this.baseMendoza = baseMendoza;
        this.alturaMendoza = alturaMendoza;
    }

    public float getBaseMendoza() {
        return baseMendoza;
    }

    public void setBaseMendoza(float baseMendoza) {
        this.baseMendoza = baseMendoza;
    }

    public float getAlturaMendoza() {
        return alturaMendoza;
    }
 
    
    public void setAlturaMendoza(float alturaMendoza) {
        this.alturaMendoza = alturaMendoza;
    }
    
    public float areaMendoza(){
        float area = (float) (getBaseMendoza()*getAlturaMendoza())/2;
        return area;
    };
    
    public void datosMendoza(){
        System.out.println("\n\nTriangulo"
                +"\nFormula (b*h)/2=A"
                +"\nBase: " + getBaseMendoza()
                +"\nAltura: " + getAlturaMendoza()
                +"\nArea: "+ areaMendoza());
    };
    
    public void insertarDatosMendoza(){
        System.out.println("Igresa la base para el triangulo: [b>0]");
        setBaseMendoza(cin.nextFloat());
        while(getBaseMendoza()<=0){
            System.out.println("Vuelva a igresar la base para el triangulo: [b>0]");
            setBaseMendoza(cin.nextFloat());
        }
        System.out.println("Igresa la altura para el triangulo: [h>0]");
        setAlturaMendoza(cin.nextFloat());
        while(getAlturaMendoza()<=0){
            System.out.println("Vuelva a igresar la altura para el triangulo: [h>0]");
            setAlturaMendoza(cin.nextFloat());
        }
    };
}
