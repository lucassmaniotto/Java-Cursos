public class Conta {
        private double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;

        //métodos do saldo
        public double getSaldo(){
            return this.saldo;
        }
        public void deposita(double valor){
            this.saldo += valor;
        }
        
        public boolean saca(double valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
                return true;
            }
            System.out.println("Saldo insuficiente");
            return false;
        }

        public boolean transfere(double valor, Conta destino){
            if(this.saldo >= valor){
                this.saldo -= valor;
                destino.deposita(valor);
                return true;
            }
            System.out.println("Saldo insuficiente");
            return false;
        }

        //métodos do número da conta
        public int getNumero(){
            return this.numero;
        }
        public void setNumero(int novoNumero){
            this.numero = novoNumero;
        }
        
        //métodos do número da agência
        public int getAgencia(){
            return this.agencia;
        }
        public void setAgencia(int novaAgencia){
            this.agencia = novaAgencia;
        }

        //métodos do titular da conta
        public Cliente getTitular(){
            return titular;
        }
        public void setTitular(Cliente titular) {
            this.titular = titular;
        }
}
