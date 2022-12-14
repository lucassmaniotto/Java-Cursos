public abstract class Conta {
        protected double saldo;
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
        
        public boolean saca(double valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
                return true;
            }
            return false;
        }

        public boolean transfere(double valor, Conta destino){
            if(this.saca(valor)){
                destino.deposita(valor);
                return true;
            }
            return false;
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
}
