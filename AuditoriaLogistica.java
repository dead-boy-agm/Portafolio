public class AuditoriaLogistica {

    public static void main(String[] args) {

        System.out.println("AUDITORIA DEL SISTEMA LOGISTICO");
        System.out.println("--------------------------------");

        fase1();
        fase2();
        fase3();
    }


    // fase 1


    public static void fase1() {

        int[] temperaturas = {12, -3, 4, 8, -1, 4, 15, 2};

        int suma = 0;
        int contador = 0;

        System.out.println("\nfase 1");

        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > 0) {
                suma += temperaturas[i];
                contador++;
            }

            if (temperaturas[i] < 0) {
                System.out.println(
                    "Temperatura bajo cero en indice: " + i
                );
            }
        }

        double promedio = (double) suma / contador;

        System.out.println(
            "Promedio de temperaturas positivas: " + promedio
        );

        /*
        Un arreglo en Java no puede cambiar su tamaño después
        de haber sido creado porque se reserva una cantidad fija
        de espacios en memoria.

        Si intentamos acceder a temperaturas[8], Java genera
        una excepcion ArrayIndexOutOfBoundsException porque
        los indices validos son del 0 al 7.
        */
    }


    // fase 2

    public static void fase2() {

        System.out.println("\nfase 2");

        int[][] inventario = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {12, 22, 32, 42},
            {14, 24, 34, 44}
        };

        // Total por sucursal
        for (int fila = 0; fila < inventario.length; fila++) {

            int total = 0;

            for (int columna = 0;
                 columna < inventario[fila].length;
                 columna++) {

                total += inventario[fila][columna];
            }

            System.out.println(
                "Stock sucursal " + fila + ": " + total
            );
        }

        // Diagonal principal
        System.out.println("Diagonal principal:");

        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i][i]);
        }

        /*
        Un arreglo bidimensional regular tiene filas con
        la misma cantidad de columnas.

        Un arreglo dentado o jagged array puede tener filas
        con diferente cantidad de elementos, ya que cada fila
        es realmente otro arreglo independiente.
        */
    }


    // fase 3

    public static void fase3() {

        System.out.println("\nfase 3");

        int[][][] contenedores = new int[2][3][3];

        // X = 4 por mi matricula termina en 4

        for (int edificio = 0;
             edificio < contenedores.length;
             edificio++) {

            for (int piso = 0;
                 piso < contenedores[edificio].length;
                 piso++) {

                for (int pasillo = 0;
                     pasillo < contenedores[edificio][piso].length;
                     pasillo++) {

                    contenedores[edificio][piso][pasillo] =
                        edificio + piso + pasillo + 4;
                }
            }
        }

        System.out.println("Coordenadas con valor par:");

        for (int edificio = 0;
             edificio < contenedores.length;
             edificio++) {

            for (int piso = 0;
                 piso < contenedores[edificio].length;
                 piso++) {

                for (int pasillo = 0;
                     pasillo < contenedores[edificio][piso].length;
                     pasillo++) {

                    int valor =
                        contenedores[edificio][piso][pasillo];

                    if (valor % 2 == 0) {

                        System.out.println(
                            "[" + edificio +
                            "][" + piso +
                            "][" + pasillo +
                            "] = " + valor
                        );
                    }
                }
            }
        }

        /*
        Si el sistema aumentara a 100 edificios, 50 pisos
        y 50 pasillos, trabajar directamente con arreglos
        tridimensionales seria mas dificil de leer y mantener.

        Con Programacion Orientada a Objetos se podrian crear
        clases como Edificio, Piso y Pasillo, haciendo el
        programa mas organizado y facil de modificar.
        */
    }
}

























