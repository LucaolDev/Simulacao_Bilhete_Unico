public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Lucas", 1234123, "Estudante");
        Bilhete bilhete = new Bilhete(usuario);

        bilhete.checarSaldo();
        bilhete.adicionarSaldo(10.00);
        bilhete.checarSaldo();
        bilhete.passaCatraca();
        bilhete.checarSaldo();


    }
}