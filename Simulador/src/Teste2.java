public class Teste2 {
    public static void main(String[] args) {

        System.out.println(somar(2, 3));
        System.out.println(somar(2, 3, 4));
        System.out.println(somar(1, 3, 3, 5, 6));

    }

    public static int somar(int ...x) {
        int soma = 0;
        for(int i : x) {
            soma += i;
        }
        return soma;
    }

}
