public class TestaBanco {
    public static void main(String[] args) {
        Conta contaDoLucas = new Conta();
        contaDoLucas.deposita(1000);
        
        /*
        Cliente lucas = new Cliente();
        lucas.nome = "Lucas Smaniotto";
        lucas.cpf = "902.340.943-20";
        lucas.profissao = "Estagiário";

        //composição
        contaDoLucas.titular = lucas;
        System.out.println(contaDoLucas.titular.nome);
        */

        contaDoLucas.titular = new Cliente();
        contaDoLucas.titular.nome = "Lucas Smaniotto";
        contaDoLucas.titular.cpf = "902.340.943-20";
        contaDoLucas.titular.profissao = "Estagiário";
        System.out.println(contaDoLucas.titular.nome);
    }
}
