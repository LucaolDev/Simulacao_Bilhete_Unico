public class Teste3 {
    public static void main(String[] args) {

        Bilhete[] bilhete = new Bilhete[3];

        //primeiro bilhete
        Usuario u1 = new Usuario("Luis", 1234, "estudante");
        bilhete[0] = new Bilhete(u1);

        //segundo bilhete
        bilhete[1] = new Bilhete(new Usuario("robson", 5678, "professor"));

        //terceiro bilhete
        bilhete[2] = new Bilhete(new Usuario("sla", 8743, "especial"));

        for(Bilhete b : bilhete){
            System.out.println(b);
        }
    }
}
