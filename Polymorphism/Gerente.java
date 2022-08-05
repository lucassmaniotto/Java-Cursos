//Gerente herda da classe Funcionario
public class Gerente extends Funcionario{
    
    private int senha;

    public boolean autenticaSenha(int senha){
        if(this.senha == senha)
            return true;
        return false;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public double getBonus(){
        return super.getBonus() + super.getSalario();
    }

}