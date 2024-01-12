public class Gerente extends Funcionario implements Autenticavel{
    
    private Autenticador autenticador;

    public Gerente(){
        this.autenticador = new Autenticador();
    }

    public double getBonus(){
        return super.getSalario();
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