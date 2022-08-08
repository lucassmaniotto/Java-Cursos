public class Administrador extends FuncionarioAutenticavel{

    @Override
    public double getBonus() {
        return (getSalario()/2);
    }
    
}
