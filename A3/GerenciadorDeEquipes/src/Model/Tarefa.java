package Model;

import java.util.Date;
import java.util.List;

public class Tarefa {
    private int idTarefa;
    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private Status status;
    private List<Usuario> reponsaveis;
    private Equipe equipe;
    private List<Atualizacao> atualizacoes;

    public void adicionarAtualizacao(){

    }

    public void marcarComoComcluida(){

    }

    public void isAtrasada(){

    }

    public void ListarAtualizacoes(){

    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Usuario> getReponsaveis() {
        return reponsaveis;
    }

    public void setReponsaveis(List<Usuario> reponsaveis) {
        this.reponsaveis = reponsaveis;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public List<Atualizacao> getAtualizacoes() {
        return atualizacoes;
    }

    public void setAtualizacoes(List<Atualizacao> atualizacoes) {
        this.atualizacoes = atualizacoes;
    }
}
