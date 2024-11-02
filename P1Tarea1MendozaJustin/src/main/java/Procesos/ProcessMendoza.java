package Procesos;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author mendo
 */
public class ProcessMendoza {
    // Función para obtener una nota válida entre 0 y 20
    public float obtenerNota(Scanner scanner) {
        float nota;
        while (true) {
            System.out.print("Ingrese una nota (0-20): ");
            try {
                nota = Float.parseFloat(scanner.next());
                if (nota >= 0 && nota <= 20) {
                    break;
                } else {
                    System.out.println("Nota inválida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente de nuevo.");
            }
        }
        return nota;
    }

    // Función para calcular el promedio de tres notas
    public float calcularPromedio(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Función para determinar el estado (aprobado o reprobado) según el promedio
    public String determinarEstado(float promedio) {
        return (promedio >= 14) ? "Aprobado" : "Reprobado";
    }

    // Función para guardar los resultados en un archivo CSV
    public void guardarEnArchivoCSV(float nota1, float nota2, float nota3, float promedio, String estado) {
        try (FileWriter archivo = new FileWriter("resultados.csv", true);
             PrintWriter pw = new PrintWriter(archivo)) {
            pw.printf("%.2f,%.2f,%.2f,%.2f,%s%n", nota1, nota2, nota3, promedio, estado);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV.");
        }
    }

    // Función para guardar los resultados en un archivo JSON
    public void guardarEnArchivoJSON(float nota1, float nota2, float nota3, float promedio, String estado) {
        try (FileWriter archivo = new FileWriter("resultados.json", true)) {
            archivo.write("{\n");
            archivo.write("  \"nota1\": " + nota1 + ",\n");
            archivo.write("  \"nota2\": " + nota2 + ",\n");
            archivo.write("  \"nota3\": " + nota3 + ",\n");
            archivo.write("  \"promedio\": " + String.format("%.2f", promedio) + ",\n");
            archivo.write("  \"estado\": \"" + estado + "\"\n");
            archivo.write("},\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo JSON.");
        }
    }
}

