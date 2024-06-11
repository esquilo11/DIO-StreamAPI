package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio12 {

    //Desafio 12 - Encontre o produto de todos os números da lista:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        List<Integer> numerosInteiros2 = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> mul = (num1, num2) -> num1 * num2;

        System.out.println(  numerosInteiros2.stream().reduce(mul)  );
    }
}
