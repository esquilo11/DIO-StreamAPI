import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    /**
     * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "String de saucação";


        List<String> listaSaudacao = Stream.generate(
                () -> "String de saucação" ).limit(5).toList();


        // LAMBDA
        listaSaudacao.forEach(s -> System.out.println(s));
        // METHOD REFERENCE
        listaSaudacao.forEach(System.out::println);




    }
}
