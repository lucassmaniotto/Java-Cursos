public class TestaFuncionario {
    public static void main(String[] args) {
        
        Funcionario lucas = new Funcionario();
        lucas.setNome("Lucas Smaniotto");
        lucas.setCPF("798.546.546-87");
        lucas.setSalario(2194.57);

        System.out.println("Usuário criado: ");

        System.out.println("Nome: " + lucas.getNome());
        System.out.println("CPF: " + lucas.getCPF());
        System.out.println("Salário: " + lucas.getSalario() + "\n");
    }
}
