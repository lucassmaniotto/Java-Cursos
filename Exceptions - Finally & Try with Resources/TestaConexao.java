public class TestaConexao {
    public static void main(String[] args) {
        
        try (Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch(IllegalStateException exception){
            System.out.println("Erro de Conexão");
        }
    
    /*
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException e) {
            System.out.println("Erro de Conexão");
        } finally {
            if(con != null)
                con.close();
        }
    }
     */

    /* Sem tratamento com Finally

        public static void main(String[] args) {
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } finally {
            con.fecha();
        }

        Saída:
        Abrindo conexao
        Recebendo dados
        Fechando conexao
        Exception in thread "main" java.lang.IllegalStateException
                at Conexao.leDados(Conexao.java:9)
                at TestaConexao.main(TestaConexao.java:6)

     */
    }
}