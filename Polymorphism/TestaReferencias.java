public class TestaReferencias {
    
    public static void main(String[] args) {

        Funcionario g1 = new Gerente();
        g1.setNome("Lucas");
        g1.setSalario(5000.0);

        Funcionario f1 = new Funcionario();
        f1.setNome("Licas");
        f1.setSalario(2000.0);
        
        ControleBonus controle = new ControleBonus();
        controle.registra(g1);
        controle.registra(f1);

        System.out.println(controle.getSoma());
    }
}
