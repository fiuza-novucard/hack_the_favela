import br.com.htf.Supermercado;
import br.com.htf.models.Bebida;
import br.com.htf.models.Carnes;
import br.com.htf.models.Cereal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Supermercado supermercado = new Supermercado();
        supermercado.setNome("Ponto Frio");
        Cereal cereal = new Cereal("Neston", 5.00, 2);
        cereal.setPeso(0.5);
        Bebida bebida = new Bebida("Coca-Cola", 5.00, 2);
        bebida.setVolume(2.0);
        Carnes carne = new Carnes("Picanha", 55.00, 1.5);
        supermercado.adicionarProduto(cereal);
        supermercado.adicionarProduto(bebida);
        supermercado.adicionarProduto(carne);
        supermercado.calcularSubtotal();

    }
}
