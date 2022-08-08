public class TestaReferencias {
    
    public static void main(String[] args) {

        Funcionario g1 = new Gerente();
        g1.setNome("Lucas");
        g1.setSalario(5000.0);

        Funcionario f1 = new Funcionario();
        f1.setNome("Licas");
        f1.setSalario(2000.0);

        Funcionario editor = new EditorDeVideo();
        editor.setNome("Felipe");
        editor.setSalario(2500.0);

        Funcionario designer = new Designer();
        designer.setNome("Paulo");
        designer.setSalario(2100);
        
        ControleBonus controle = new ControleBonus();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(editor);
        controle.registra(designer);

        System.out.println(controle.getSoma());
    }
}
