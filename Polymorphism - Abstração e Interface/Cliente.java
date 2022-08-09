public class Cliente implements Autenticavel{

    private Autenticador autenticador;

    public Cliente(){
        this.autenticador = new Autenticador();
    }

    @Override
    public boolean autenticaSenha(int senha) {
      return this.autenticador.autenticaSenha(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha); 
    }
    
}
