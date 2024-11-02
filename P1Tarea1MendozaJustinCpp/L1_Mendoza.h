#ifndef L1_MENDOZA_H_INCLUDED
#define L1_MENDOZA_H_INCLUDED

#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
using namespace std;

// Función para obtener una nota válida entre 0 y 20
float obtenerNota() {
    float nota;
    while (true) {
        cout << "Ingrese una nota (0-20): ";
        cin >> nota;
        if (cin.fail() || nota < 0 || nota > 20) {
            cin.clear(); // Limpiar el error de entrada
            cin.ignore(10000, '\n'); // Ignorar el resto de la entrada
            cout << "Nota inválida. Intente de nuevo." << endl;
        } else {
            break;
        }
    }
    return nota;
}

// Función para calcular el promedio de tres notas
float calcularPromedio(float nota1, float nota2, float nota3) {
    return (nota1 + nota2 + nota3) / 3;
}

// Función para determinar el estado (aprobado o reprobado) según el promedio
string determinarEstado(float promedio) {
    return (promedio >= 14) ? "Aprobado" : "Reprobado";
}

// Función para guardar los resultados en un archivo de texto
void guardarEnArchivoTexto(float nota1, float nota2, float nota3, float promedio, const string& estado) {
    ofstream archivo("resultados.txt", ios::app);
    if (archivo.is_open()) {
        archivo << fixed << setprecision(2);
        archivo << "Notas: " << nota1 << ", " << nota2 << ", " << nota3
                << " - Promedio: " << promedio << " - Estado: " << estado << endl;
        archivo.close();
    } else {
        cout << "Error al abrir el archivo de texto." << endl;
    }
}

// Función para guardar los resultados en un archivo binario
void guardarEnArchivoBinario(float nota1, float nota2, float nota3, float promedio, const string& estado) {
    ofstream archivo("resultados.bin", ios::app | ios::binary);
    if (archivo.is_open()) {
        archivo.write(reinterpret_cast<const char*>(&nota1), sizeof(nota1));
        archivo.write(reinterpret_cast<const char*>(&nota2), sizeof(nota2));
        archivo.write(reinterpret_cast<const char*>(&nota3), sizeof(nota3));
        archivo.write(reinterpret_cast<const char*>(&promedio), sizeof(promedio));

        int longitudEstado = estado.size();
        archivo.write(reinterpret_cast<const char*>(&longitudEstado), sizeof(longitudEstado));
        archivo.write(estado.c_str(), longitudEstado);

        archivo.close();
    } else {
        cout << "Error al abrir el archivo binario." << endl;
    }
}

#endif // L1_MENDOZA_H_INCLUDED
