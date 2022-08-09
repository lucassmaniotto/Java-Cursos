public class Gerente extends Funcionario implements Autenticavel{
    
    private int senha;

    public double getBonus(){
        return super.getSalario();
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