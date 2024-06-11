package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {

    // Desafio 1 - Mostre a lista na ordem numérica:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        numerosInteiros.stream().sorted().forEach(System.out::println);

    }

}
