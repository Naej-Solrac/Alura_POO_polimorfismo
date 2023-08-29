public class TestGerente {
    public static void main(String[] args) {
        //Gerente jeanG = new Gerente();
        //jeanG.setSalario(5000);
        //System.out.println("salario " + jeanG.getSalario());
        //System.out.println("bonificacion " + jeanG.getBonificacion());

//        Funcionario gerente = new Funcionario();
//        gerente.setTipo(1);
//        gerente.setSalario(4000);
//        System.out.println(gerente.getBonificacion());

        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setClave("Alura");
        gerente.setSalario(1);
        System.out.println(gerente.iniciarSesion("Alura"));
    }
}
