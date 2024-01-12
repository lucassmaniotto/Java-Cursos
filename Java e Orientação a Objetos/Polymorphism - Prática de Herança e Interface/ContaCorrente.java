//Herda atributos, mas não construtores
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override //Ctrl + Space
    public boolean saca(double valor) {
        return super.saca(valor + 0.2);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
    
}
