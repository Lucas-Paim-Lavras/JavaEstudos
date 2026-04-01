package unidade01.Aula2;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;   //Iniciar nulo
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depositado com sucesso!");
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor<= saldo){
            this.saldo -= valor;
            System.out.println("Sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDados(){
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}
