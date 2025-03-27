import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {

    private BilheteUnico[] bilhete = new BilheteUnico[5];
    private int index = 0;

    public void menuPrincipal() {
        int opcao;
        String menu = "1. Administrador\n2. Usuário\n3. Finalizar";

        do{
            opcao = parseInt(showInputDialog(menu));
            if(opcao < 1 || opcao > 3) {
                showMessageDialog(null, "Opção inválida");
            }
            else {
                switch(opcao) {
                    case 1:
                        menuAdministrador();
                        break;
                    case 2:
                        menuUsuario();
                        break;
                }
            }
        } while(opcao != 3);
    }

    private void menuUsuario() {
        int opcao;
        String menu = "1. Colsutar bilhete\n2. Carregar bilhete\3. Passar na catraca\n4. Sair";
        do{
            opcao = parseInt(showInputDialog(menu));
            if(opcao < 1 || opcao > 4){
                showMessageDialog(null, "Opção Inválida!");
            }
            else{
                switch (opcao){
                    case 1:
                        consultarSaldo();
                        break;
                    case 2:
                        carregarBilhete();
                    case 3:
                        passarNaCatraca();
                        break;
                }
            }
        }while (opcao != 4);
    }

    private void passarNaCatraca() {
        int posicao = pesquisar();
        if(posicao != 1){
            bilhete[posicao].passarNaCatraca();
        }
    }

    private void carregarBilhete() {
        int posicao = pesquisar();
        double valor;
        if(posicao != -1){
            valor = parseDouble(showInputDialog("Valor de recarga"));
            bilhete[posicao].carregar(valor);
        }
    }

    private void consultarSaldo() {
        int posicao = pesquisar();
        if(posicao != -1){
            showMessageDialog(null, bilhete[posicao].consultarSaldo());
        }
    }

    private void menuAdministrador() {
        int opcao;
        String menuAdmin = "1. Emitir bilhete\n";
        menuAdmin += "2. Listar bilhetes\n";
        menuAdmin += "3. Remover bilhetes\n";
        menuAdmin += "4. Sair\n";

        do {
            opcao = parseInt(showInputDialog(menuAdmin));
            if(opcao < 1 || opcao > 4) {
                showMessageDialog(null, "Opção inválido");
            }
            else {
                switch(opcao) {
                    case 1:
                        emitirBilhete();
                        break;
                    case 2:
                        listarBilhetes();
                        break;
                    case 3:
                        removerBilhete();
                        break;
                }
            }
        } while(opcao != 4);
    }

    private void removerBilhete() {
        int posicao = pesquisar();
        int resposta;
        if(posicao != -1){
            resposta = showConfirmDialog(null, "Tem certeza que deseja remover? ");
            if(resposta == YES_OPTION){
                bilhete[posicao] = bilhete[index-1];
                index--;
            }
        }
    }

    private void listarBilhetes(){
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        for(int i = 0; i < index; i++){
            aux += "Número do bilhete: " + bilhete[i].numero + "\n";
            aux += "Nome do usuário: " + bilhete[i].usuario.nome + "\n";
            aux += "Saldo R$ " + df.format(bilhete[i].consultarSaldo()) + "\n";
            aux += "Tipo de tarifa (perfil): " + bilhete[i].usuario.tipoTarifa + "\n";
            aux += "---------------------------------------\n";
        }
        showMessageDialog(null, aux);
    }

    private void emitirBilhete() {
        String nome;
        long cpf;
        String perfil;

        if(index < bilhete.length) {
            nome = showInputDialog("Nome:");
            cpf = parseLong(showInputDialog("CPF"));
            perfil = showInputDialog("Estudante ou Professor ou Comum");
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, perfil));
            index++;
        }
    }

    private int pesquisar(){
        long cpf = parseInt(showInputDialog("CPF"));
        for (int i = 0; i < index; i++) {
            if(bilhete[i].usuario.cpf == cpf){
                return i;
            }
        }
        showMessageDialog(null, cpf + " não encontrado");
        return -1;
    }
}
