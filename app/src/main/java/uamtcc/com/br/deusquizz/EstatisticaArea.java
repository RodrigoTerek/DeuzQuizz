package uamtcc.com.br.deusquizz;

import java.io.Serializable;

public class EstatisticaArea implements Serializable {

    private String nome;
    private String[] materias;
    private float[] porcentagem;

    public EstatisticaArea(String nome, String[] materias, float[] porcentagem) {
        this.nome = nome;
        this.materias = materias;
        this.porcentagem = porcentagem;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public float[] getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float[] porcentagem) {
        this.porcentagem = porcentagem;
    }
}
