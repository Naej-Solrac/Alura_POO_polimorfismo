public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario jean = new Funcionario();
        jean.setNombre("jean");
        jean.setDocumento("986987");
        jean.setSalario(4500);
        jean.setTipo(0);
        System.out.println(jean.getNombre());
        System.out.println(jean.getDocumento());
        System.out.println(jean.getSalario());
        System.out.println(jean.getBonificacion());
    }
}
