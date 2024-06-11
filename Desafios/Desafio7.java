package Desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Desafio7 {

    //Desafio 7 - Encontrar o segundo número maior da lista:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,5,4,3);

        System.out.println(  numerosInteiros.stream().sorted().distinct().toList().reversed().get(1)  );


    }
}
