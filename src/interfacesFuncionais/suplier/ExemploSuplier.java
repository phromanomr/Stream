package interfacesFuncionais.suplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSuplier {
    public static void main(String[] args) {
        Supplier<String> saudar = () -> "Seja bem vindo!";

        List<String> listaSaudacoes = Stream.generate(saudar)
            .limit(5)
            .collect(Collectors.toList());

        listaSaudacoes.forEach(mensagem -> System.out.println(mensagem));
    }
}
