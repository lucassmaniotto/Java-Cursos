public class Autenticador {
    
    private int senha;

    public boolean autenticaSenha(int senha) {
        if(this.senha == senha)
            return true;
        return false;
    }

   
    public void setSenha(int senha) {
        this.senha = senha;        
    }
}
