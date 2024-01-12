public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 3533);
        System.out.println("Agência: " + conta.getAgencia() + "\n" + "Conta: " + conta.getNumero() + "\n");
    
        Conta conta2 = new Conta(1337, 3534);
        System.out.println("Agência: " + conta2.getAgencia() + "\n" + "Conta: " + conta2.getNumero() + "\n");

        Conta conta3 = new Conta(1337, 3535);
        System.out.println("Agência: " + conta3.getAgencia() + "\n" + "Conta: " + conta3.getNumero() + "\n");

        Conta contaOutroConstructor = new Conta(3745);
        System.out.println("Agência: " + contaOutroConstructor.getAgencia() + "\n" + "Conta: " + contaOutroConstructor.getNumero() + "\n");

        System.out.println("O total de contas é cadastradas no sistema é " + Conta.getTotal());
    }
}
