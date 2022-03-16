public class Instancia {
    public static void main(String[]args){
        Gerente g = new Gerente();
        g.setNome("Romário");
        g.setCpf("000.000.000-01");
        g.setData_nascimento("23/03/2001");
        g.setSalario(2000);
        g.setLogin("EncantadorDeNoob");
        g.setSenha("Senhatop123");

        g.bonificacao();
        System.out.println(g.getNome());
        System.out.println(g.getCpf());
        System.out.println(g.getData_nascimento());
        System.out.println(g.getSalario());
        System.out.println(g.getLogin());
        System.out.println(g.getSenha());

        System.out.println("");

        Secretaria s = new Secretaria();
        s.setNome("Luana");
        s.setCpf("000.000.000-02");
        s.setData_nascimento("24/04/2003");
        s.setSalario(1500);
        s.setRamal(2);

        s.bonificacao();
        System.out.println(s.getNome());
        System.out.println(s.getCpf());
        System.out.println(s.getData_nascimento());
        System.out.println(s.getSalario());
        System.out.println(s.getRamal());
    }
}
