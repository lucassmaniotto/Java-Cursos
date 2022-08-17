package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias(){
        this.referencias = new Object [10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object conta) {
        this.referencias[this.posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElemento() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int index) {
        return this.referencias[index];
    }
}
