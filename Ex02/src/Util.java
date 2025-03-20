import javax.swing.*;

public class Util {

    public void menuPrincipal(){
        int opcao = 0;
        String menu = "1. Administrador\n2. Usuario";

        do{
            JOptionPane.showInputDialog(menu);
        }while (opcao != 3);
    }
}
