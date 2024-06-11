package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Desafio13 {

    //Desafio 13 - Filtrar os números que estão dentro de um intervalo:

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        List<Integer> numerosFiltrados = new ArrayList<>();

        numerosFiltrados = numerosInteiros.stream().filter(n -> n >= 3 && n <= 7).collect(Collectors.toList());

        System.out.println(numerosFiltrados);
    }
}
