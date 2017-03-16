
import logica.Cliente;
import personaje.Personaje;

/**
 *
 * @author VARGAS
 */
public class Test {
    public static void main(String args[]){
        Cliente cli = new Cliente();
        cli.seleccionarConstructor("Mago");
        Personaje p = cli.crear(cli.getConstructor());
        Personaje q = p.clonarPersonaje();
        
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(cli.toString());
    }
}
