package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {

    //Desafio 16 - Agrupe os números em pares e ímpares:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        numerosPares = numerosInteiros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        numerosImpares = numerosInteiros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println(numerosPares);
        System.out.println(numerosImpares);
    }
}
