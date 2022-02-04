package co.com.sofkau.tl;

import javax.swing.*;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    public static int[][] matriz;

    public static void main(String[] args) {

        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de columnas"));
        int valIn= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor inicial"));
        int puntoInicio= Integer.parseInt(JOptionPane.showInputDialog(null, "Elija fila/columna para iniciar"));
        matriz = new int[filas][columnas];
        //recorrerFilaDerechaIzquerda(matriz, puntoInicio,valIn);

        //4/2/22: Prueba de columna ascendente - Exitosa; por Mishell~
        recorrerColumnaAscendente(matriz,2,2);
        imprimirMatriz(matriz);
    }
    // parámetros: matriz, nro fila o columna, el nro en el que comienza


    private static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }


    }

    private static void recorrerFilaIzquierdaDerecha(int[][] matriz, int numeroFila, int valorInicial) {
        int cont = valorInicial;
        for (int i = 0; i < matriz[numeroFila-1].length; i++) {
            if (matriz[numeroFila-1][i] == 0) {
                matriz[numeroFila-1][i] = cont;
                cont++;
            }
        }
    }

    private static void recorrerFilaDerechaIzquerda(int[][] matriz, int numeroFila, int valorInicial) {
        int contador = valorInicial;
        for (int i = matriz[numeroFila-1].length-1; i >= 0; i--) {
            if (matriz[numeroFila-1][i] == 0) {
                matriz[numeroFila-1][i] = contador;
                contador++;
            }
        }

    }

    private static void recorrerColumnaDescendente(int[][] matriz, int numeroColumna, int valorInicial) {
        int contador = valorInicial;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][numeroColumna - 1] == 0) {
                matriz[i][numeroColumna - 1] = contador;
                contador++;
            }
        }
    }
    //4/2/22: Implementación de llenado abajo - arriba por Mishell~
    private static void recorrerColumnaAscendente(int[][] matriz, int numeroColumna, int valorInicial){
        int contador = valorInicial;
        for (int i = matriz.length -1 ; i >= 0;  i--) {
            if (matriz[i][numeroColumna - 1] == 0) {
                matriz[i][numeroColumna - 1] = contador;
                contador++;
            }
        }
    }
}




