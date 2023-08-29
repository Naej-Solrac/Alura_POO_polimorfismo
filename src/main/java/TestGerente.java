public class TestGerente {
    public static void main(String[] args) {
        //Gerente jeanG = new Gerente();
        //jeanG.setSalario(5000);
        //System.out.println("salario " + jeanG.getSalario());
        //System.out.println("bonificacion " + jeanG.getBonificacion());

        Funcionario gerente = new Funcionario();
        gerente.setSalario(4000);
        gerente.setTipo(1);
        System.out.println(gerente.getBonificacion());
    }
}
