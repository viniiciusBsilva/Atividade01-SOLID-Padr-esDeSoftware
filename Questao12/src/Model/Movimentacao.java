package Model;

import java.util.Calendar;

public class Movimentacao {
    private double valor;
    private Conta conta;
    private Calendar data;

    public Movimentacao(double valor, Conta conta, Calendar data) {
        this.valor = valor;
        this.conta = conta;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
