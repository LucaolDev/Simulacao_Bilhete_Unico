public class Teste2 {
    public static void main(String[] args) {

        System.out.println(somar(2, 3));
        System.out.println(somar(2, 3, 4));
        System.out.println(somar(1, 3, 3, 4, 5));
    }

    public static int somar(int ...numeros) {
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        return soma;
    }

}
