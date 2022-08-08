//Objetos dessa classe não são instanciados
public abstract class FuncionarioAutenticavel extends Funcionario {

    private int senha;

    public boolean autenticaSenha(int senha){
        if(this.senha == senha)
            return true;
        return false;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
    
}