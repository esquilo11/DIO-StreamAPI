package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio19 {

    //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        System.out.println( numerosInteiros.stream().filter(n -> n%3==0 || n%5==0).reduce(0, Integer::sum));
        //System.out.println(  numerosInteiros.stream().filter(n -> n%3==0 && n%5==0).toList().stream().reduce(0, Integer::sum)  );
    }
}
