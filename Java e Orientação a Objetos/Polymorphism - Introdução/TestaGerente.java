public class TestaGerente {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Aquele");
        gerente.setCPF("789.546.548-98");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCPF());
        System.out.println(gerente.getSalario());

        gerente.setSenha(1222);
        
        boolean autenticou = gerente.autenticaSenha(1222);
        System.out.println(autenticou);

        System.out.println(gerente.getBonus());
    }
}
