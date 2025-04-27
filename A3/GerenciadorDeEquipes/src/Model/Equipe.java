package Model;

import java.util.List;
import java.util.List;

public class Equipe {
    private int idEquipe;
    private String nomeEquipe;
    private List<Usuario> Usuario;

    public void adicionarUsuario(Usuario usuario) {
        Usuario.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        Usuario.remove(usuario);
    }

    public void listarUsuarios() {
        Usuario = Usuario;
    }

    public void listarTarefas(){

    }
}
