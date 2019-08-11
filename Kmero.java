package prueba;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;

public class Kmero{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Faltan argumentos.");
        } else {

            String binario = args[0];
            int k = 1;
            int m = 0;
            String[] array = binario.split("");
            Hashtable<String, Integer> elementos = new Hashtable<String, Integer>();
            int count = 0;
            int mayor = 0;
            String kmero = "";
            int valorK = 0;

            for(int j = 0; j < array.length; j++){
                String[][] array2 = new String[array.length - m][k];
                for(int i = 0; i < array.length - m; i++){
                    array2[i] = Arrays.copyOfRange(array, i, i + k);
                }

                ArrayList<String> lista = new ArrayList<String>();
                String aux;
                
                for(String[] a: array2){
                    aux = "";
                    for(String b: a){
                        aux += b;
                    }
                    lista.add(aux);
                }

                // Convertir array en un conjunto

                Set<String> items = new HashSet<>();

                for (String i : lista){
                    items.add(i);
                }

                for(String x: items){
                    for(String y: lista){
                        if(x.equals(y)){
                            count++;
                        }
                    }
                    elementos.put(x, count);
                    count = 0;
                }

                System.out.println("\nCuando K vale: " + k + "\n");

                for(String i: items){
                    System.out.println("Kmero: " + i + ", veces repetidas: " + elementos.get(i) + " x "
                    + "K : " + k + " = " + elementos.get(i) * k);
                    if(mayor < elementos.get(i) * k){
                        mayor = elementos.get(i) * k;
                        kmero = i;
                        valorK = k;
                    }
                }
                m++;
                k++;
            }
            System.out.println("\nEl K-mero mayor fue " + kmero + " con la frecuencia " + mayor
            + ", cuando K tomo el valor de " + valorK + ".");
        }
    }
}