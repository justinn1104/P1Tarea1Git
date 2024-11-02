#include <iostream>
#include "L1_Mendoza.h"
using namespace std;
int main() {
    char opcion;
    do {
        // Ingreso de notas
        float nota1 = obtenerNota();
        float nota2 = obtenerNota();
        float nota3 = obtenerNota();

        // Cálculo de promedio
        float promedio = calcularPromedio(nota1, nota2, nota3);

        // Determinación de estado
        string estado = determinarEstado(promedio);

        // Mostrar resultados
        cout << "Promedio: " << fixed << setprecision(2) << promedio << " - " << estado << endl;

        // Guardar resultados en archivos
        guardarEnArchivoTexto(nota1, nota2, nota3, promedio, estado);
        guardarEnArchivoBinario(nota1, nota2, nota3, promedio, estado);

        // Preguntar si desea ingresar otro registro
        cout << "¿Desea ingresar otro registro? (S/N): ";
        cin >> opcion;

    } while (opcion == 'S' || opcion == 's');

    return 0;
}
