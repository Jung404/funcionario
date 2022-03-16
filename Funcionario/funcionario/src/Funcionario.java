public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String data_nascimento;
    protected double salario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setData_nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public String getData_nascimento(){
        return this.data_nascimento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public abstract void bonificacao();
    
}
