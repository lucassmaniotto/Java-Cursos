public class Conta {
        private double saldo;
        int agencia;
        int numero;
        Cliente titular;
        //Cliente titular = new Cliente(); -> para não precisar inicializar o obj Cliente na main

        public void deposita(double valor){
            this.saldo += valor;
        }
        
        public boolean saca(double valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente");
                return false;
            }
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

        public double informaSaldo(){
            return this.saldo;
        }
}
