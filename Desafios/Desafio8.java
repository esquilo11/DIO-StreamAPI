package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio8 {

    //Desafio 8 - Somar os dígitos de todos os números da lista:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        BinaryOperator<Integer> somar = Integer::sum;

        System.out.println( numerosInteiros.stream().reduce(0, somar) );


    }
}
