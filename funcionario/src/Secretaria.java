public class Secretaria extends Funcionario {
    protected double ramal;

    public void setRamal(double ramal){
        this.ramal = ramal;
    }

    public double getRamal(){
        return this.ramal;
    }

    public void bonificacao(){
        this.salario = salario * 0.15;
    }

}
