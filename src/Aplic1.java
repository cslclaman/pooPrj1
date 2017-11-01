
import com.poo.model.Cliente;
import com.poo.model.ItemPedido;
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
        
        Produto prod2 = new Produto(1, "Papel");
        prod2.setPrecoUnit(0.1);
        prod2.setQtdeDisponivel(100);
        
        Cliente cli1 = new Cliente("1234", "João Pereira", 1000.00);
        Vendedor vend1 = new Vendedor(1500.00, "4321", "Andreia");
        
        Pedido pedido1 = new Pedido(1, "31/10/2017");
        pedido1.setCliente(cli1);
        pedido1.setVendedor(vend1);
        
        ItemPedido item = new ItemPedido(1, 10);
        item.setProduto(prod1);
        pedido1.addItemPedido(item);
        
        item = new ItemPedido(2, 50);
        item.setProduto(prod2);
        pedido1.addItemPedido(item);
        
        System.out.println("Pedido: " + pedido1.getNumero());
        System.out.println("Vendedor: " + vend1.getNome());
        System.out.println("Cliente: " + cli1.getNome());
        int c = 0;
        System.out.println("Itens:");
        while(pedido1.getItensPedidos().size() > c){
            System.out.println("Produto: " + pedido1.getItensPedidos().get(c).getProduto().getDescricao());
            System.out.println("Quantidade pedida: " + pedido1.getItensPedidos().get(c).getQtdeVendida());
            System.out.print("\n");
            c++;
        }
        
        System.out.println(prod1.getDescricao() + " " + prod1.getQtdeDisponivel());
        System.out.println(prod2.getDescricao() + " " + prod2.getQtdeDisponivel());
        
    }
    
}
