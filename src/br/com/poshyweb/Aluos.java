package br.com.poshyweb;

import java.io.Serializable;
import java.util.Objects;

public class Aluos implements Serializable {

    private String Matricula;
    private String nome;
    private Integer idade;

    public Aluos() {

    }

    public Aluos(String matricula, String nome, Integer idade) {
        Matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluos aluos = (Aluos) o;
        return Objects.equals(Matricula, aluos.Matricula) && Objects.equals(nome, aluos.nome) && Objects.equals(idade, aluos.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Matricula, nome, idade);
    }

    @Override
    public String toString() {
        return "Aluos{" +
                "Matricula='" + Matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
