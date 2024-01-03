package org.example;

public class Main {
    public static void main(String[] args) {
        matrixCreator(3, 4);
    }

    public static void matrixCreator(int dimensione1, int dimensione2) {
        int[][] matrix = new int[dimensione1][dimensione2];
        int somma = 0;
        for (int i = 0; i < dimensione1; i++) {
            for (int j = 0; j < dimensione2; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                somma = somma + matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println(" La somma degli elementi della matrice è: " + somma);
    }
}
