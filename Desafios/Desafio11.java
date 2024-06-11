package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio11 {

    //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        List<Integer> numerosInteirosRed = Arrays.asList(3, 1, 5);


        System.out.println(  numerosInteirosRed.stream().map( n -> n*n).reduce(0, Integer::sum)  );
    }
}
