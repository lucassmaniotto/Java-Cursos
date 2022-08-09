public class Administrador extends Funcionario implements Autenticavel{

    private Autenticador autenticador;

    public Administrador(){
        this.autenticador = new Autenticador();
    }
    
    @Override
    public double getBonus() {
        return (getSalario()/2);
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
