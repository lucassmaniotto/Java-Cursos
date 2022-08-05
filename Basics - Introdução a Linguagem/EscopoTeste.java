public class EscopoTeste {

    public static void main(String[] args) {
        System.out.println("Testing conditionals");
        int idade = 10;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if(quantidadePessoas >= 2){
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        
        if(idade >= 18 && acompanhado){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("Unfortunally you can't access :(");
        }
    }
}
