import br.com.htf.contracts.CalculoArea;
import br.com.htf.implementations.CalculoAreaImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        CalculoAreaImpl calculoArea = new CalculoAreaImpl(4,4,2);
        CalculoAreaImpl.calcularAny();
        System.out.println(CalculoArea.calcularAreaQuadrado(2));
    }
}
