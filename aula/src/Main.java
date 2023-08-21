import br.com.htf.Supermercado;
import br.com.htf.contracts.CalculoArea;
import br.com.htf.implementations.CalculoAreaImpl;
import br.com.htf.models.Bebida;
import br.com.htf.models.Cereal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Supermercado supermercado = new Supermercado();
        supermercado.setNome("Ponto Frio");
        Cereal cereal = new Cereal("Neston", 5.00, 2);
        cereal.setPeso(0.5);
        Bebida bebida = new Bebida("Coca-Cola", 5.00, 2);
        bebida.setVolume(2.0);
        supermercado.adicionarProduto(cereal);
        supermercado.adicionarProduto(bebida);
        supermercado.calcularSubtotal();
    }
}
