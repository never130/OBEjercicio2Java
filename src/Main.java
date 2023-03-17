public class Main {
    /*
     *  Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido
     *
     */
    public static void main(String[] args) {
        System.out.println("El precio con el IVA incluido es de: $" + getPriceIVA(100, 30));

    }

    static double getPriceIVA(double precio, double iva) {
        return precio + iva;
    }
}