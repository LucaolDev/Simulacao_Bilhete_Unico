import java.util.Random;

public class TesteVetor {
    public static void main(String[] args) {

        int[] x = new int[5];
        lerDados(x);
        imprimir(x);

    }
    public static void imprimir(int[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // for each
        for(int i : x) {
            System.out.println(i);
        }
    }
    public static void lerDados(int[] x) {
        Random rd = new Random();
        for(int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(15);
        }
    }
}
