package interfacesFuncionais.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        Function<String, Integer> dobrar = num -> Integer.parseInt(num) * 2;

        List<Integer> numeroDobrados = numeros.stream().map(dobrar).toList();

        numeroDobrados.forEach(System.out::println);
    }
}
