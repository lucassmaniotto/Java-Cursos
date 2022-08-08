//Objetos dessa classe não são instanciados
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //método sem corpo => não há implementação aqui
    public abstract double getBonus();

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
        
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
}