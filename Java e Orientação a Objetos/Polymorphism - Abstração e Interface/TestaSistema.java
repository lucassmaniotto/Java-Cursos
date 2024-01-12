public class TestaSistema {
    
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(333);

        Cliente cli = new Cliente();
        cli.setSenha(444);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cli);
    }
}
