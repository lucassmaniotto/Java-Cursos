public class Cliente implements Autenticavel{

    private int senha;

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
