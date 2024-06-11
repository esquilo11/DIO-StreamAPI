import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        /**
         * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
         * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
         */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> dobrar = numero -> numero * 2;
        Function<Integer, Integer> sqrp1 = numero -> numero * numero + 1;



        List<Integer> numerosDobrados = numeros.stream().map(sqrp1).collect(Collectors.toList());
//       A function a ser padda dentro do map pode
//       ser inserida diretamente no formato de espressão lambda neste caso n -> n * 2
//       e o collect pode ser resumido diretamente ao metodo toList
        List<Integer> numerosDobrados2 = numeros.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
