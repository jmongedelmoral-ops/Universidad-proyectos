/*
Autor: José Manuel Monge Delmoral
Nro. Control: 25490973
Fecha: 01/03/2026

Título: Programa de encriptado Hill 3x3 con módulo Ascii (256)

Observaciones: -Todas las 'X's las vuelve en un espacio vacío.
               -Sólo admite un String sin espacios.
*/

package AlgebraLineal;
import java.math.BigInteger;
import java.util.Scanner;



public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //El usuario ingresa texto
        System.out.println("Inserte el mensaje que quiere encriptar y desencriptar");
        String mensaje = sc.next();
        
        //Declaración de Matriz 3x3
        
        int[][] Matriz = new int[3][3];
        
        //Llenado de matriz
        
        
        //Ingresando en las filas, Matriz.length recorre las filas una por una
        for (int i = 0; i < Matriz.length; i++){
            
        //Llenando las filas, Matriz[i].length recorre las columnas una por una 
        for (int j = 0; j < Matriz[i].length; j++){
            
        //Inserción de datos
        System.out.print("Inserte el elemento ("+(i+1)+","+(j+1)+"): ");
        Matriz[i][j] = sc.nextInt();
        
        
        }
        
        }
       //Área de cálculos
       
        int [][] matrizTransLineal = validador.cifrarMensaje(mensaje);
        int detMatriz = calcDet(Matriz);
        int modulo = 256;

        //Si la matriz es cero, o no es coprima de 256, el código termina abruptamente
        if (detMatriz == 0 || detMatriz % 2 == 0){
            System.out.println("La matriz dada no tiene inversa puesto a que su determinate es cero o no es coprimo de 256");
            sc.close();
            return;
        }

        /*
        Investigando, para criptogramas de Hill, envés de dividir, es necesario multiplicar 
        por el inverso modular para garantizar resultados enteros.

        El funcionamiento interno de cómo lo calcula exactamente (Algoritmo de Euclides) 
        está fuera de mi conocimiento
        */
        BigInteger bDet = BigInteger.valueOf(detMatriz);
        BigInteger bMod = BigInteger.valueOf(modulo);
        int inversoDet = bDet.modInverse(bMod).intValue();

        int[][] traspuesta = calcTras(Matriz);
        int[][] adjunta = moduloMatriz(adjMatriz(traspuesta), modulo);
        int[][] inversa = moduloMatriz(productoMatriz(adjunta, inversoDet), modulo);
        int[][] matrizCifr = validador.transforMatriz(Matriz, matrizTransLineal);
        int[][] matrizDescif = validador.transforMatriz(inversa, moduloMatriz(matrizCifr, modulo));

        //Área de impresión
        
        System.out.println("Det = "+detMatriz);

        System.out.println("Matriz original: "); 
        impMatriz(Matriz);
        System.out.println();
        
        System.out.println("C original");
        impMatriz(matrizTransLineal);
        System.out.println();
        
        System.out.println("Matriz traspuesta: ");
        impMatriz(traspuesta);;
        System.out.println();
        
        System.out.println("Matriz adyacente: ");
        impMatriz(adjunta);
        System.out.println();
        
        System.out.println("Matriz inversa: ");
        impMatriz(inversa);
        System.out.println();
        
        System.out.println("Vectores cifrados ");
        impMatriz(matrizCifr);
        System.out.println();
        
        System.out.println("Vectores descifrados ");
        impMatriz(matrizDescif);
        System.out.println();
        
        System.out.println("Mensaje oculto: ");
        System.out.println(validador.decodificadorFinal(matrizDescif));

        sc.close();

    }

    //Área de métodos
    
    //Pasos para calcular la inversa: 
    //
    // 1. Mediante Sarrus se calcula el determinante, 
    //    este método también ayuda para calcular la adjunta 2x2

    public static int calcDet(int[][] matriz){
        int[] A, B;
        int sumA = 0;
        int sumB = 0;
        int det;
        int agarrar = 0;


        //Det(matriz) = sum(A)-sum(B)
        if (matriz.length % 2 != 0){
         A = new int[matriz.length];
         B = new int[matriz.length];
        }
        else{
            A = new int[matriz.length-1];
            B = new int[matriz.length-1];
        }

         for(int i = 0; i < A.length; i++){
            A[i] = 1;
            B[i] = 1;
        }



        //Metiéndonos en A y rellenándolo con las multiplicaciones
        for(int i = 0; i < A.length; i++){
            agarrar = i;
                for(int j = 0; j < matriz.length; j++){
                    for(int k = 0; k < matriz[j].length; k++){
                        if(k == agarrar){
                            A[i] *= matriz[j][k];
                        }
                    }
                    if (agarrar == matriz.length-1){
                        agarrar = 0;
                    }
                    else
                        agarrar++;
                }

           
        }

        //Metiéndonos en B y rellenándolo con las multiplicaciones
        for(int i = B.length-1; i >= 0; i--){
            agarrar = i;
                for(int j = matriz.length-1; j >= 0; j--){
                    for(int k = matriz[j].length-1; k >= 0 ; k--){
                        if(k == agarrar){
                            B[i] *= matriz[j][k];
                        }
                    }
                    if (agarrar == matriz.length-1){
                        agarrar = 0;
                    }
                    else
                        agarrar++;
                }

           
        }

        //Área de sumas

        for (int i = 0; i < A.length; i++){
            sumA += A[i];
            
        }

        for (int i = 0; i < B.length; i++){
        sumB += B[i];
        }

        
         det = sumA - sumB;


        return det;

       }

    // 2. Se saca la traspuesta  de la matriz

    public static int[][] calcTras(int[][] matriz){

        int filas = matriz[0].length;
        int columnas = matriz.length;

        int[][] matrizTras = new int[filas][columnas];

        //Rellenando con los valores del índice contrario en el original
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matrizTras[i][j] = matriz[j][i];


            }
        }
        

        return matrizTras;
    }
    
    //3. Se obtiene la matriz adjunta a la traspuesta
    public static int[][] adjMatriz(int[][] matriz){


        //Inicializamos la matriz adjunta
        int[][] matrizAdj = new int[matriz.length][matriz.length];
        
                
        //Este ciclo for recorrerá la matriz original
           for (int i = 0; i < matriz.length; i++){
               for (int j = 0; j < matriz.length; j++){

                //Se crea el Submatriz 2x2 para rellenar con los elementos fuera de la fila y columna
                        int[][] detMatAdj = new int[2][2];
                        //Recorremos las filas p del submatriz 2x2
                        for(int p = 0; p < detMatAdj.length; p++){
                            
                            //Se crean dos índices (k, l) que recorrerán la matriz original
                            for(int k = 0; k < matriz.length; k++){
                                //k recorre las filas, si la fila es distinta de i entonces:
                                if (k != i){

                                    //recorremos las columnas q del submatriz 2x2
                                    for (int q = 0; q < detMatAdj.length; q++){
                                        //l recorre las columnas del matriz original 
                                        for(int l = 0; l < matriz.length; l ++){

                                            //si l es distinto de j, entonces el elemento debe añadirse al submatriz 2x2
                                            if (l != j){
                                                detMatAdj[p][q] = matriz[k][l];
                                                //Pasamos a la siguiente columna del submatriz 2x2
                                                q++; 
                                            }
                                        }   
                            
                                    }
                                //Una vez rellena la fila p, pasamos a la siguiente fila del submatriz 2x2   
                                p++;
                                }
                        }
                    }
                    
                    //El elemento se multiplica por -1 si la suma de sus índices es impar
                    if ((i+j)%2 != 0){
                        matrizAdj[i][j] = calcDet(detMatAdj)*-1;
                    }
                    //Si no es impar, no se multiplica por -1
                    else
                        matrizAdj[i][j] = calcDet(detMatAdj);
                        }
                        
                    }

        return matrizAdj;
    
    }
    
    //4.Por último se multiplica la adjunta por inverso multiplicativo modular del determinante 
    
    public static int[][] productoMatriz(int [][] matriz, int escalar){
        int [][] producto = new int[matriz.length][matriz.length];
        
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                producto[i][j] =  matriz[i][j] * escalar;
            }

        }
        
        return producto;
        
    }

    




//Métodos misceláneos para calidad de vida:

    //Método para calcular el módulo
    public static int[][] moduloMatriz(int[][] matriz, int modulo){
        int[][] matrizModular = new int[matriz.length][3];

        //filas de la matriz
        for (int i = 0; i < matriz.length; i++){
            //columnas de la matriz
            for(int j = 0; j < matriz[i].length; j++){
                matrizModular[i][j] = (matriz[i][j]) % modulo;

                //Si el módulo es negativo, sumarle el modulador nos dará su equivalente positivo.
                if(matrizModular[i][j] < 0){
                    matrizModular[i][j] += modulo;
                }
            }
        }
        return matrizModular;
    }


    //Método simple para imprimir matrices
    public static void impMatriz(int[][] matriz){

        //filas
        for (int i = 0; i < matriz.length; i++){
            //columnas
            for(int j = 0; j < matriz[i].length; j++){
                //imprime cada elemento (i,j)
                System.out.print("[ "+matriz[i][j]+" ]");
                
            }
            //salto de línea al cambiar de fila
            System.out.println();
        }

    }


}
