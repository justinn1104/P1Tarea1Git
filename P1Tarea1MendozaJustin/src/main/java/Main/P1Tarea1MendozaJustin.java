package Main;

import java.util.Scanner;
import Procesos.ProcessMendoza;

/**
 *
 * @author mendo
 */
public class P1Tarea1MendozaJustin {
    public static void main(String[] args) {
        ProcessMendoza acces = new ProcessMendoza();
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            // Ingreso de notas
            float nota1 = acces.obtenerNota(scanner);
            float nota2 = acces.obtenerNota(scanner);
            float nota3 = acces.obtenerNota(scanner);

            // Cálculo de promedio
            float promedio = acces.calcularPromedio(nota1, nota2, nota3);

            // Determinación de estado
            String estado = acces.determinarEstado(promedio);

            // Mostrar resultados
            System.out.printf("Promedio: %.2f - %s%n", promedio, estado);

            // Guardar resultados en archivos
            acces.guardarEnArchivoCSV(nota1, nota2, nota3, promedio, estado);
            acces.guardarEnArchivoJSON(nota1, nota2, nota3, promedio, estado);

            // Preguntar si desea ingresar otro registro
            System.out.print("¿Desea ingresar otro registro? (S/N): ");
            opcion = scanner.next().charAt(0);

        } while (opcion == 'S' || opcion == 's');

        scanner.close();
    }
}
