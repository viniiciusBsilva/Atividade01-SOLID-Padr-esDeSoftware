package Model;

public class ContaBancaria {

    protected double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public void investimento(double valor){
        this.saldo+=valor;
    }

}
