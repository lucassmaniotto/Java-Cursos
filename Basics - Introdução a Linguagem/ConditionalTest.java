public class ConditionalTest {

    public static void main(String[] args) {
        System.out.println("Testing conditionals");
        int idade = 10;
        int quantidadePessoas = 3;

        if(idade >= 18){
            System.out.println("You are older than 18 years!");
        }
        else {
            if(quantidadePessoas >= 2){
                System.out.println("You don't have 18 years, but you can access because you have a responsable with you!");
            }
            System.out.println("Unfortunally you can't access :(");
        }
    }
}
