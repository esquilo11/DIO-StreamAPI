package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {

    //Desafio 3 - Verifique se todos os números da lista são positivos:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        Predicate<Integer> positivos = numero -> numero >= 0;

        System.out.println(     numerosInteiros.stream().allMatch(positivos)        );

    }

}
