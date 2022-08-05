public class Conta {
        private double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int total;

        //construtores
        public Conta(int agencia, int numero){
            Conta.total++;
            this.agencia = agencia;
            this.numero = numero;
        }

        /* 
        No Java podemos chamar a implementação de um construtor através de outro
        usando simplesmente this( ) com os parâmetros exigidos pelo construtor.
        */

        public Conta(int numero){
            this(1335, numero); // por padrão a Agência fica como 1335 quando desejamos criar uma conta somente com o número
        }


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
