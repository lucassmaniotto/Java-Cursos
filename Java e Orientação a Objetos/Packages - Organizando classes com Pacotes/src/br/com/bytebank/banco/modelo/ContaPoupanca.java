package br.com.bytebank.banco.modelo;


//Herda atributos, mas não construtores
public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }
    
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
