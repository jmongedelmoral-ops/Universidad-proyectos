package AlgebraLineal;

public class validador {
    
    //Pasos para cifrar un mensaje
    //
    //1. Convertimos cada caracter a un número 
    //(Para este programa, arbitrariamente se usa el formato Ascii (256))

    public static int[] codificarMensaje(String mensaje){
        //Como estamos cifrando en 3x3, la longitud del mensaje forzosamente debe ser
        //múltiplo de 3.

        //Variable ajustar que añadirá  X al vector a devolver
        int ajustar = 0;
        
        //Ciclo que dictará cuantas X se añadirán al mensaje para volverlo en múltiplo de 3.
        for (int i = 0; i< mensaje.length(); i++ ){

            //Si al mensaje original, añadir una X no lo vuelve múltiplo de 3, añade otra.
            if((mensaje.length()+ajustar) %3 !=0){
                ajustar++;
                i--;
            }
        }

        //Vector que guardará el mensaje múltiplo de 3
        int [] vector = new int[mensaje.length()+ajustar];

        //Aquí convertimos las letras a números
        for (int i = 0; i <= vector.length-1; i++){
            //Cuando ya no haya más letras pero falten espacios, rellenar con el 
            //número equivalente a X.
            if(i > mensaje.length()-1){
                vector[i] =(int) 'X';
            }
            else
            //De lo contrario, guarda los números de las letras del mensaje original
                vector[i] = (int) mensaje.charAt(i);
        }
            
        
        return vector; //Introducir Hola devuelve [ 72, 111, 108, 97, 88, 88 ]
    }

    //2. Por último separamos los números de 3 en 3

     public static int[][] cifrarMensaje(String mensaje){

        //Creamos un vector con todas las letras convertidas a números
        int[] vector = codificarMensaje(mensaje);

        //Creamos un vector bidimensional que guardará los números de 3 en 3.
        int[][] cifrado = new int[vector.length/3][3];

        //Hacemos un ciclo que recorra la matriz cifrado
        for(int i = 0; i< cifrado.length; i++){
            //Este otro ciclo recorrerá cada columna de la matriz
            for(int j = 0; j < cifrado[i].length; j++ ){

                //Este ciclo recorrerá el vector original con los números
                for(int k = 0; k < vector.length; k++){
                    cifrado[i][j] = vector[k];
                    
                    //Si j alcanza su tope, entonces vuelve a cero e i aumenta en uno si no está en su máximo
                    if(j == cifrado[i].length-1){
                        if(i == cifrado.length-1){
                            break;
                        }
                        else{
                            j=0;
                            i++;
                        }
                    }
                    else
                        j++;
                }

            }
        }
        
        return cifrado; //Introducir [ 72, 111, 108, 97, 88, 88 ]  devuelve     [ 72 ][ 111 ][ 108 ]
                        //                                                      [ 97 ][ 88 ][ 88 ];
    }  

    //3. Transformarmos linealmente multiplicando por un K invertible
    //(Este método también se usa para descifrar el mensaje con K^-1).
    public static int[][] transforMatriz(int[][] K, int[][] C){
        int filas = K.length;
        int columnas = C.length;
        int[][] bloqueDifuso = new int[columnas][filas]; 
        
        for (int i = 0; i < C.length; i++){
            bloqueDifuso[i] = transforLineal(K, C[i]);
            
            
        }
        
        return bloqueDifuso;
    }

    //Método para cifrar cada uno de los vectores
    public static int[] transforLineal (int[][] matriz, int[] vector){
        
        //Llamaremos ciphertext al texto resultante de transformar linealmente un vector
        int[] cipherText = new int[vector.length];
        
        //filas
        for(int i = 0; i < vector.length; i++){
            //columnas
            for(int j = 0; j < matriz.length; j++){
                
                
                cipherText[i] += matriz[i][j] * vector[j];
            }
            
            //Se usa el módulo de 256 para cubrir todos los caracteres Ascii
            cipherText[i] = cipherText[i] % 256;
        }
        return cipherText;
    }
    

//Método para decodificar número a texto
    public static char[] decodificarMensaje(int[] vector){

        //Crea un arreglo donde guardaremos el texto
        char[] mensajeFinal = new char[vector.length];
        //Recorremos cada elemento del vector
        for(int i = 0; i< vector.length; i++){
            //convertimos el equivalente en letra del número
            mensajeFinal[i] = (char) vector[i]; 
        }

        return mensajeFinal; //Introducir [ 72, 111, 108] devuelve ['H', 'o', 'l'];
    };


//Método para pegar todos los caracteres y presentarlos
    public static String decodificadorFinal(int[][] matrizDescif){
        StringBuilder mensajeConstructor = new StringBuilder();
        String mensajeLimpio;
        for(int i = 0; i< matrizDescif.length; i++){
            mensajeConstructor.append(decodificarMensaje(matrizDescif[i]));
            
        }
        
        //Retiramos las X del final
        mensajeLimpio = mensajeConstructor.toString().replaceAll("X+$", "");

        return mensajeLimpio; //introducir ['H', 'o', 'l']['a','X', 'X'] devuelve Hola;
    }
}
