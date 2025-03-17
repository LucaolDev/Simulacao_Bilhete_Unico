import java.util.Random;

public class Bilhete {
    static final double VALOR_PASSAGEM = 5.20;

    private int numero;
    private Usuario usuario;
    private double saldo;

    public Bilhete(Usuario usuario) {
        this.usuario = usuario;
        numero = gerarNumero();
    }

    private int gerarNumero() {
        Random rd = new Random();
        return rd.nextInt(10000);
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
        System.out.println(String.format("%.2f", saldo) + "$ de saldo adicionado");
    }

    public void checarSaldo() {
        System.out.println("Saldo: " + String.format("%.2f", saldo));
    }

    public void passaCatraca() {
        double debito = VALOR_PASSAGEM;

        if (usuario.getTipoUsuario().equalsIgnoreCase("normal")) {
            debito = VALOR_PASSAGEM;
        } else {
            debito = VALOR_PASSAGEM / 2;
        }
        if (saldo > debito) {
            saldo -= debito;
        }
    }

    @Override
    public String toString() {
        return "Bilhete{" +
                "numero=" + numero +
                ", usuario=" + usuario +
                ", saldo=" + saldo +
                '}';
    }
}