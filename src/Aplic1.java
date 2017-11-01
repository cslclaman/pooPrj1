
import com.poo.model.Cliente;
import com.poo.model.Pedido;
import com.poo.model.Produto;
import com.poo.model.Vendedor;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class Aplic1 {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, "Caneta");
        prod1.setPrecoUnit(1.50);
        prod1.setQtdeDisponivel(100);
        
        Cliente cli1 = new Cliente("1234", "João Pereira", 1000.00);
        Vendedor vend1 = new Vendedor(1500.00, "4321", "Andreia");
        
        Pedido pedido1 = new Pedido(1, "31/10/2017");
        pedido1.setCliente(cli1);
        
        vend1.addPedido(pedido1);
        
    }
    
}
