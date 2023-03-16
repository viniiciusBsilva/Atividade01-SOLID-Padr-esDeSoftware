package Model;

public interface PagadorDeFuncionario {
    void depositarPagamento();
    double calcularValorBase();
    double calcularExtras();

}
