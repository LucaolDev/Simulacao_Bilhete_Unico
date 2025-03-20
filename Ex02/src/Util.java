import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Util {
    private Usuario[] usuarios = new Usuario[5];
    private int index = 0;

    public void menuPrincipal() {
        int opcao = 1;
        String menu = """
                1 - Administrador
                2 - Usuário
                3 - Finalizar
                """;
        do {
            try {
                opcao = parseInt(showInputDialog(menu));
                switch (opcao) {
                    case 1:
                        menuAdmin();
                        break;
                    case 2:
                        break;
                    case 3:
                        showMessageDialog(null, "Encerrando o programa");
                        break;
                    default:
                        showMessageDialog(null, "Opção inválida!");
                        break;
                }
            } catch(NumberFormatException e){}
        } while (opcao != 3);
    }

    public void menuAdmin() {
        int opcao = 1;
        String menuAdmin = """
                1 - Adicionar bilhete
                2 - Remover bilhete
                3 - Listar bilhetes registrados
                4 - Sair
                """;
        do {
            try {
                opcao = parseInt(showInputDialog(menuAdmin));
                switch (opcao) {
                    case 1:
                        adicionarBilhete();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        showMessageDialog(null, "Opção inválida!");
                        break;
                }
            } catch (NumberFormatException n) {}
        } while(opcao != 4);
    }

//    private void removerBilhete() {
//        int opcao;
//        if (index > 0) {
//            opcao = parseInt(showInputDialog("Selecione um bilhete para remover: "));
//            if (opcao > index || opcao < 0) {
//                showMessageDialog(null, "Usuário inválido");
//            } else {
//                usuarios[opcao] = usuarios[opcao + 1];
//                showMessageDialog(null, "Usuário removido");
//                index--;
//            }
//        } else {
//            showMessageDialog(null, "Nenhum usuário para apagar");
//        }
//    }

    private void adicionarBilhete() {
        if (index < usuarios.length) {
            String nome = showInputDialog("Digite o nome do usuário");
            long cpf = Long.parseLong(showInputDialog("Digite o CPF do usuário"));
            String tipoTarifa = showInputDialog("Digite o tipo de usuário");
            usuarios[index] = new Usuario(nome, cpf, tipoTarifa);
            index++;
            showMessageDialog(null, "Usuário cadastrado");
        } else {
            showMessageDialog(null, "Limite de bilhetes excedido");
        }
    }
}