package br.com.bytebank.banco.modelo;

public abstract class Conta extends Object{
        protected double saldo; //público para filhos
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int total;

        //construtor
        public Conta(int agencia, int numero){
            Conta.total++;
            this.agencia = agencia;
            this.numero = numero;
        }

        //métodos do saldo
        public double getSaldo(){
            return this.saldo;
        }
        public abstract void deposita(double valor);
        
        public void saca(double valor) throws SaldoInsuficienteException{
            if(this.saldo < valor){
                throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
            }
                this.saldo -= valor;
        }

        public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
            this.saca(valor);
                destino.deposita(valor);
        }

        //métodos do número da conta
        public int getNumero(){
            return this.numero;
        }
        public void setNumero(int numero){
            if(numero <= 0){
                System.out.println("Não é permitido valores negativos e ZERO");
                return;
            }
            this.numero = numero;
        }
        
        //métodos do número da agência
        public int getAgencia(){
            return this.agencia;
        }
        public void setAgencia(int agencia){
            if(agencia <= 0){
                System.out.println("Não é permitido valores negativos e ZERO");
                return;
            }
            this.agencia = agencia;
        }

        //métodos do titular da conta
        public Cliente getTitular(){
            return titular;
        }
        public void setTitular(Cliente titular) {
            this.titular = titular;
        }

        //métodos do total
        public static int getTotal(){
            return Conta.total;
        }

        @Override
        public String toString() {
            return "Número: " + this.numero + ", Agencia: " + this.agencia;
        }
        
        @Override
        public boolean equals(Object ref){

            Conta outra = (Conta) ref;

            if(this.agencia != outra.agencia){
                return false;
            }

            if(this.numero != outra.numero){
                return false;
            }

            return true;
        }
}
