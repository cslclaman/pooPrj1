
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
        
        Produto prod2 = new Produto(2, "Papel");
        prod2.setPrecoUnit(0.1);
        prod2.setQtdeDisponivel(100);
        
        Produto prod3 = new Produto(3, "Lapís");
        prod3.setPrecoUnit(0.1);
        prod3.setQtdeDisponivel(30);
        
        Cliente cli1 = new Cliente("1234", "João Pereira", 1000.00);
        cli1.setCidade("Sorocaba");
        
        Vendedor vend1 = new Vendedor("4321", "Andreia",1500.00);
        vend1.setUf("SP");
        
        Pedido pedido1 = new Pedido(1, "31/10/2017");
        pedido1.setCliente(cli1);
        pedido1.setVendedor(vend1);
        
        
        
        ItemPedido item1 = new ItemPedido(1, 10);
        item1.setProduto(prod1);
        pedido1.addItemPedido(item1);
        
        ItemPedido item2 = new ItemPedido(2, 50);
        item2.setProduto(prod2);
        pedido1.addItemPedido(item2);
        
        
        System.out.println("Pedido: " + pedido1.getNumero());
        System.out.println("Vendedor: " + vend1.getNome());
        System.out.println("Cliente: " + cli1.getNome());
        System.out.println("Limite disponível: " + cli1.getLimiteDisp());
        int c = 0;
        System.out.println("Itens:");
        while(pedido1.getItensPedidos().size() > c){
            System.out.println("Produto: " + pedido1.getItensPedidos().get(c).getProduto().getDescricao());
            System.out.println("Quantidade pedida: " + pedido1.getItensPedidos().get(c).getQtdeVendida());
            System.out.println("Custo Total: " + (pedido1.getItensPedidos().get(c).getQtdeVendida()*pedido1.getItensPedidos().get(c).getProduto().getPrecoUnit()));
            System.out.print("\n");
            c++;
        }
        
        System.out.println("\n\n"+prod1.getDescricao() + " " + prod1.getQtdeDisponivel());
        System.out.println(prod2.getDescricao() + " " + prod2.getQtdeDisponivel());
        System.out.println(prod3.getDescricao() + " " + prod3.getQtdeDisponivel());
        System.out.println("Limite disponível: " + cli1.getLimiteDisp()+"\n\n\nPedido 2\n");
        
        Pedido pedido2 = new Pedido(2, "05/02/2016");
        pedido2.setCliente(cli1);
        pedido2.setVendedor(vend1);
        ItemPedido item3 = new ItemPedido(3, 30);
        item3.setProduto(prod3);
        pedido2.addItemPedido(item3);
        
        System.out.println("\n\n\nPedido: " + pedido2.getNumero());
        System.out.println("Vendedor: " + vend1.getNome());
        System.out.println("Cliente: " + cli1.getNome());
        System.out.println("Limite disponível: " + cli1.getLimiteDisp());
        c = 0;
        System.out.println("Itens:");
        while(pedido2.getItensPedidos().size() > c){
            System.out.println("Produto: " + pedido2.getItensPedidos().get(c).getProduto().getDescricao());
            System.out.println("Quantidade pedida: " + pedido2.getItensPedidos().get(c).getQtdeVendida());
            System.out.println("Custo Total: " + (pedido2.getItensPedidos().get(c).getQtdeVendida()*pedido2.getItensPedidos().get(c).getProduto().getPrecoUnit()));
            System.out.print("\n");
            c++;
        }
        
        System.out.println("\n\n"+prod1.getDescricao() + " " + prod1.getQtdeDisponivel());
        System.out.println(prod2.getDescricao() + " " + prod2.getQtdeDisponivel());
        System.out.println(prod3.getDescricao() + " " + prod3.getQtdeDisponivel());
        System.out.println("Limite disponível: " + cli1.getLimiteDisp());
        
    }
    
}
