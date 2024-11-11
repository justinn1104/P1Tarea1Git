package Ejercicios;
import java.util.Scanner;

public class RectanguloMendoza {
    Scanner cin = new Scanner(System.in);
    private float baseMendoza, alturaMendoza;

    public RectanguloMendoza(float baseMendoza, float alturaMendoza) {
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
        float area = (float) getBaseMendoza()*getAlturaMendoza();
        return area;
    };
    
    public void datosMendoza(){
        System.out.println("Formula b*h=A"+
                "Base: " + getBaseMendoza()+
                "Altura: " + getAlturaMendoza()+
                "\n Area: "+ areaMendoza());
    };
   
    public void insertarDatosMendoza(){
        System.out.println("Igresa la base para el rectangulo: ");
        setBaseMendoza(cin.nextFloat());
        System.out.println("Igresa el altura para el rectangulo: ");
        setAlturaMendoza(cin.nextFloat());
    };
}
