package Model;

import java.time.LocalDate;

public class Chefe implements PagadorDeFuncionario{
    private int id;
    private String nome;
    private LocalDate dataDeAdmissao;
    private double salarioBase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public void depositarPagamento() {

    }

    @Override
    public double calcularValorBase() {
        return 0;
    }

    @Override
    public double calcularExtras() {
        return 0;
    }
}
