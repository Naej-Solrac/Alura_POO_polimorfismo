import java.util.Objects;

public class Gerente extends Funcionario {
    private String clave;
    public void setClave (String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion (String clave) {
        return this.clave == clave;
    }
    public double getBonificacion() {
        //return this.Salario();
        return super.getSalario();
    }
}
