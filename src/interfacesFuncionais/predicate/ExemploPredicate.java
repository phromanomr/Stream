package interfacesFuncionais.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "abacate", "limão", "pera", "uva");

        Predicate<String> quatroCaracteres = palavra -> palavra.length() == 4;

        List<String> palavrasFiltradas = palavras.stream().filter(quatroCaracteres).toList();

        palavrasFiltradas.forEach(System.out::println);
    }
}
