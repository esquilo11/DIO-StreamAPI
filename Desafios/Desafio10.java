package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio10 {

    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        Predicate<Integer> impm3 = numero -> (numero % 3 == 0 || numero % 5 == 0);

        System.out.println(  numerosInteiros.stream().filter(impm3).collect(Collectors.toList())  );
    }
}
