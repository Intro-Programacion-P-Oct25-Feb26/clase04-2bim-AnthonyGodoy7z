/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};
        for (int i= 0; i < valores1.length; i++){
            int v1 = valores1[i];
            int v2 = valores2[i];
            obtenerSuma(v1, v2);
        }
        /*
        v1 y v2 toman el valor de las variables cadenadax de valores 1 y 2 
        a travez del ciclo for y en este se llama al procediemiento obtenerSuma
        con 2 argumentos para que realiza las sumas finales por cada repeticion
        del ciclo for hasta completar la longitud de valor1.
        
        
        */
    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}
