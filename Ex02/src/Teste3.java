public class Teste3 {
    public static void main(String[] args) {

        BilheteUnico[] bilhete = new BilheteUnico[3];

        //primeiro bilhete
        Usuario u1 = new Usuario("Luis", 1234, "estudante");
        bilhete[0] = new BilheteUnico(u1);

        //segundo bilhete
        bilhete[1] = new BilheteUnico(new Usuario("robson", 5678, "professor"));

        //terceiro bilhete
        bilhete[2] = new BilheteUnico(new Usuario("sla", 8743, "especial"));

        for(BilheteUnico b : bilhete){
            System.out.println(b);
        }
    }
}
