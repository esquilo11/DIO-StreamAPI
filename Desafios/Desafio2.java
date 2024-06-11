package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio2 {

    //Desafio 2 - Imprima a soma dos números pares da lista:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado;
        resultado = numerosInteiros.stream().reduce(0, somar);

        System.out.println(resultado);
    }
}
