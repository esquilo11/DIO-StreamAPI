package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3,-1);

        System.out.println(  numerosInteiros.stream().anyMatch(n -> n < 0)  );
    }
}
