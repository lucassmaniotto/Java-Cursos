public class TestaGetESet{

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        conta.setAgencia(99);
        System.out.println((conta.getNumero()) + "\n" + (conta.getAgencia()));

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Smaniotto");
        lucas.setCpf("902.584.125-89");
        lucas.setProfissao("Aquela lá");
        conta.setTitular(lucas);
        System.out.println(conta.getTitular().getNome() + "\n" + conta.getTitular().getCpf() + "\n" + conta.getTitular().getProfissao());
        conta.getTitular().setProfissao("Estagiário");
        System.out.println(conta.getTitular().getNome() + "\n" + conta.getTitular().getCpf() + "\n" + conta.getTitular().getProfissao());

    }
}