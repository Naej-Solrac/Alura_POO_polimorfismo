public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Jean");
        Gerente gerente = new Gerente();
        gerente.setNombre("Ximena");

        funcionario.setSalario(2000);
        System.out.println(funcionario.getSalario());
        gerente.setSalario(6000);

        gerente.iniciarSesion("aaa");
    }
}
