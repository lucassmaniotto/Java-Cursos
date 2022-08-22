import java.io.Serializable;

public class Cliente implements Serializable{

    private static final long serialVersionUID = -1696154943621310443L;
    private String nome;
    private String cpf;
    private String profissao;

    public String getNomeCpf(){
        return nome + ", " + cpf;
    }

    public String getNomeCpfProfissao(){
        return nome + ", " + cpf + ", " + profissao;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getProfissao(){
        return profissao;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    
    @Override
    public String toString(){
        return "Cliente: " + this.nome;
    }
}
