package alcarazmelanytp5;


public class Arreglos {

    public static void sumarLista(int lista[]) {
        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
            promedio = suma / lista.length;
        }
        System.out.println("El suma de los valores es de: " + suma);
        System.out.println("El promedio de los valores es de: " + promedio);
    }

    public static void buscarMayor(int lista[][]) {
        int mayor = lista[0][0];
        for (int fila = 0; fila < lista.length; fila++) {
            for (int colum = 0; colum < lista[fila].length; colum++) {
                if (lista[fila][colum] > mayor) {

                    mayor = lista[fila][colum];
                }
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }

    public static void cuentaVocales(String palabra) {
        int vocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales es de: " + vocales);

    }

    public static void cuentaCaracter(String s, char c) {
        int caracter = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == c) {
                caracter++;
            }
        }
        System.out.println("La cantidad de vocales es de: " + caracter);

    }

}
