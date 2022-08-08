//Gerente herda da classe Funcionario
public class Gerente extends FuncionarioAutenticavel{
    
    public double getBonus(){
        return super.getSalario();
    }

}