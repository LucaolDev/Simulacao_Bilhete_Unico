import java.util.Random;

public class BilheteUnico {
    static final double TARIFABASE = 5.20;
    int numero;
    double saldo;
    Usuario usuario;

    public BilheteUnico(Usuario usuario) {
        numero = gerarNumero();
        this.usuario = usuario;
    }

    private int gerarNumero() {
        Random random = new Random();
        return random.nextInt(1000, 10000);
    }

    // método para carregar o bilhete
    public void carregar(double valor) {
        saldo += valor;
    }

    // método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    // método para passar na catraca
    public void passarNaCatraca() {
        double debito;
        if(usuario.tipoTarifa.equalsIgnoreCase("tarifa")) {
            debito = TARIFABASE;
        }
        else {
            debito = TARIFABASE / 2;
        }

        if(saldo >= debito) {
            saldo -= debito;
        }
    }

}
