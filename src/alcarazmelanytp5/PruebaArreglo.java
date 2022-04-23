package alcarazmelanytp5;


import alcarazmelanytp5.Arreglos;


public class PruebaArreglo {

    public static void main(String[] args) {

        Arreglos a = new Arreglos();

        int lista1[] = new int[]{1, 2, 3, 4, 25};
        a.sumarLista(lista1);

        int lista[][] = new int[][]{{10, 70, 87, 26, 34}, {18, 24, 95, 45, 57}};
        a.buscarMayor(lista);

        a.cuentaVocales("vacaciones");
        a.cuentaCaracter("palabra", 'a');

    }
}
