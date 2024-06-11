package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio4 {

    //Desafio 4 - Remova todos os valores ímpares:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        Predicate<Integer> par = n -> n % 2 == 0;

        List<Integer> numerosPares = numerosInteiros.stream().filter(par).collect(Collectors.toList());

        System.out.println(numerosInteiros);
        System.out.println(numerosPares);
    }
}
