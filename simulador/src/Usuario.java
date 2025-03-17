public class Usuario {
    private String nome;
    private long cpf;
    private String tipoUsuario;

    public Usuario(String nome, long cpf, String tipoUsuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}