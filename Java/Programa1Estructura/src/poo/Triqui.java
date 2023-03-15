package poo;
import java.util.Scanner;

public class Triqui {
    static char[][] tablero = new char[3][3];
    static int fila, columna;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTablero();
        boolean ganador = false;
        int jugador = 1;
        char marca;
        while (!ganador) {
            if (jugador % 2 == 1) {
                marca = 'X';
            } else {
                marca = 'O';
            }
            mostrarTablero();
            System.out.println("Turno del jugador " + jugador + ". Marca '" + marca + "'");
            System.out.print("Ingrese la fila: ");
            fila = sc.nextInt();
            System.out.print("Ingrese la columna: ");
            columna = sc.nextInt();
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Coordenadas inválidas. Inténtelo de nuevo.");
                continue;
            }
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = marca;
                ganador = comprobarGanador(marca);
                jugador++;
            } else {
                System.out.println("La casilla ya está ocupada. Inténtelo de nuevo.");
            }
        }
        mostrarTablero();
        System.out.println("¡El jugador " + (--jugador) + " ha ganado!");
    }

    public static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean comprobarGanador(char marca) {
        return (tablero[0][0] == marca && tablero[0][1] == marca && tablero[0][2] == marca
                || tablero[1][0] == marca && tablero[1][1] == marca && tablero[1][2] == marca
                || tablero[2][0] == marca && tablero[2][1] == marca && tablero[2][2] == marca
                || tablero[0][0] == marca && tablero[1][0] == marca && tablero[2][0] == marca
                || tablero[0][1] == marca && tablero[1][1] == marca && tablero[2][1] == marca
                || tablero[0][2] == marca && tablero[1][2] == marca && tablero[2][2] == marca
                || tablero[0][0] == marca && tablero[1][1] == marca && tablero[2][2] == marca
                || tablero[0][2] == marca && tablero[1][1] == marca && tablero[2][0] == marca);
    }
}

