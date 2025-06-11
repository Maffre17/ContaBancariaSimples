class Conta {
    // Atributos privados da conta: nome, id e saldo.
    private String nome;
    private String id;
    private double saldo = 0;

    // Construtor recebe o nome e o id.
    public Conta(String nome, String id) {
        this.nome = nome;
        this.id = id;

    }

    // Metodo para realizar o deposito na conta.
    public double depositar(double valor) {
        // Verifica se o valor é menor ou igual a zero, se for lança uma exceção de argumento invalido.
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido de deposito");
        }
        // Soma o valor ao saldo e retorna o novo saldo
        return saldo += valor;
    }
    // Metodo para realizar o saque na conta.
    public double saque(double valor) {

        // Verifica se o valor é menor ou igual a zero, se for lança uma exceção de argumento invalido.
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido de saque");
        }
        // Verifica se o valor é menor do que o saldo, se for lança uma exceção de argumento invalido.
        if (valor > saldo) {
            throw new IllegalArgumentException("Impossivel fazer o saque o valor em conta é mais baixo do que o valor do saque");
        } else {
            // Subbtrai o valor do saldo e retorna o novo saldo.
            return saldo -= valor;
        }
    }

    // Metodo para exibir o saldo atual da conta
    public void getSaldo() {
        System.out.println("Saldo atual é de: R$ " + saldo);
        //imprime o saldo no console
    }
}

public class SistemaBancarioSimples {
    public static void main(String[] args) {
        // Cria uma nova conta com nome "Marcela" e id "123"
        Conta c1 = new Conta("Marcela", "123");
        // Realiza o deposito de R$ 1.000,00 na conta.
        c1.depositar(1000);
        // Realiza o saque de R$ 100,00 na conta.
        c1.saque(100);
        // Exibe o saldo atual da conta
        c1.getSaldo();
    }
}