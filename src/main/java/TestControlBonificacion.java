public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario jean = new Funcionario();
        jean.setSalario(2000);
        Gerente ximena = new Gerente();
        ximena.setSalario(10000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(jean);
        controlBonificacion.registrarSalario(ximena);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        controlBonificacion.registrarSalario(alexis);


    }
}
