package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Desafio5 {

    //Desafio 5 - Calcule a média dos números maiores que 5:

    public static void main(String[] args) {
        List<Integer> numerosInteros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        OptionalDouble media = numerosInteros.stream().filter(n -> n >5).mapToDouble(Integer::doubleValue).average();

        System.out.println(media);
    }
}
