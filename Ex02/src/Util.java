import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Util {

    BilheteUnico[] bilhete = new BilheteUnico[5];
    private int index = 0;

    public void menuPrincipal() {
        int opcao = 0;
        String menu = "1. Administrador\n2. Usuario\n3. Finalizar";

        do {
            opcao = parseInt(showInputDialog(menu));
            if (opcao < 1 || opcao > 3) {
                showMessageDialog(null, "Opção Inválida");
            } else {
                switch (opcao) {
                    case 1:
                        menuAdiministrador();
                        break;
                    case 2:
                        menuUsuario();
                        break;
                }
            }

        } while (opcao != 3);
    }

    private void menuUsuario() {
    }

    private void menuAdiministrador() {
        int opcao = 0;
        String menuAdiministrador = "1. Emitir Bilhete\n2. Listar Bilhetes\n3. Remover Bilhetes\n4. Sair\n";

        do{
            opcao = parseInt(showInputDialog(menuAdiministrador));
            if(opcao < 1 || opcao > 4){
                showMessageDialog(null, "Opção Inválida");
            }
            else {
                switch (opcao){
                    case 1:
                        emitirBilhete();
                        break;
                }
            }
        }while (opcao != 4);
    }

    private void emitirBilhete() {
        String nome;
        long cpf;
        String perfil;

        if(index < bilhete.length){
            nome = showInputDialog("Nome: ");


        }
    }
}
