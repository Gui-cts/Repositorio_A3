package Model;

import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senhaHash;
    private Enum tipo;
    private List<Competencia> competencia;

    public void login(String email, String senhaHash) {
        this.email = email;
        this.senhaHash = senhaHash;
    }

    public void logout() {
        this.email = "";
        this.senhaHash = "";
    }

    public void adiconarCompetencia(List<Competencia> competencia) {
        this.competencia = competencia;
    }

    public void removerCompetencia(List<Competencia> competencia) {
        this.competencia = competencia;
    }

    public void listarCompetencia() {

    }

    public void isLider(){

    }

    public void recuperarSenha(String senha) {
        this.senhaHash = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public Enum getTipo() {
        return tipo;
    }

    public List<Competencia> getCompetencia() {
        return competencia;
    }

    public void setCompetencia(List<Competencia> competencia) {
        this.competencia = competencia;
    }
}
