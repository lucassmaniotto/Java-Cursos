public class Administrador extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public double getBonus() {
        return (getSalario()/2);
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if(this.senha == senha)
            return true;
        return false;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;        
    }
    
}
