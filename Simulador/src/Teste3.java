public class Teste3 {
    public static void main(String[] args) {

        BilheteUnico[] bilhete = new BilheteUnico[3];

        // primeiro bilhete
        Usuario u1 = new Usuario("Selmini", 123, "P");
        bilhete[0] = new BilheteUnico(u1);

        // segundo bilhete
        bilhete[1] = new BilheteUnico(new Usuario("Age", 256, "P"));

        // segundo bilhete
        bilhete[2] = new BilheteUnico(new Usuario("Ana", 256, "P"));

        for(BilheteUnico b : bilhete) {
            System.out.println(b.usuario.nome);
        }

    }
}
