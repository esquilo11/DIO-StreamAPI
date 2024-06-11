package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio9 {

    //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,4,5,6);

        System.out.println(  numerosInteiros.equals(numerosInteiros.stream().distinct().toList())  );

    }
}
