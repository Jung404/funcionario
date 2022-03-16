public class Gerente extends Funcionario{
    protected String login;
    protected String senha;

    public void setLogin(String login){
        this.login = login;
    }

    public String getLogin(){
        return this.login;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    public void bonificacao(){
        this.salario = salario * 0.25;
    }
}
