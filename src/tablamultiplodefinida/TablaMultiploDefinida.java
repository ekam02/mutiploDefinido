/*
 * Programa que solicite al usuario un número entero, con base a ese número
 * calcular la tabla de multiplicar hasta un número entero también definido
 * por el usuario.
 */
package tablamultiplodefinida;

import java.util.Scanner;

/**
 *
 * @author Enrique A. Martínez Agudelo
 */
public class TablaMultiploDefinida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variavles 'start' y 'end'
        int start, end;
        // Declaración de objeto 'val' de tipo 'Scanner()'.
        Scanner val = new Scanner(System.in);
        // Muestra 'Digite el valor de tabla inicial.'.
        System.out.println("Digite el valor de tabla inicial.");
        // Entrega a 'start' el valor capturado.
        start = val.nextInt();
        // Muestra 'Digite el valor de tabla final.'.
        System.out.println("Digite el valor de tabla final.");
        // Entrega a 'end' el valor capturado.
        end = val.nextInt();
        // Llamada al metodo 'tablas()'.
        tablas(start, end);
    }
    /**
     * tablas() muestra por terminal las tablas de multiplicar del 1 al 10 desde
     * un valor inicial a un valor final dado.
     * @param start Valor de la primera tabla.
     * @param end Valor de la última tabla.
     */
    private static void tablas(int start, int end) {
        // Evalua si 'start' es mayor a 'end', si lo es invirete sus valores.
        if(start > end) {
            int aux;
            aux = start;
            start = end;
            end = aux;
        }
        // Declaración del ciclo 'for'.
        for(int i = start; i <= end; i++) {
            for(int j = 1; j <= 10; j++) {
                // Muestra por terminal la operación y su resultado.
                System.out.println(i+" x "+j+" = "+i*j);
            }
            // Muestra un salto de linea.
            System.out.println("");
        }
    }
    
}
