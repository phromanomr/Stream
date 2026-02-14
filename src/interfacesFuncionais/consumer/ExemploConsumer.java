package interfacesFuncionais.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25, 30); 
        
        Consumer<Integer> imprimirImpares = num -> {
            if(num % 2 != 0){
                System.out.println(num);
            }
        };

        numeros.forEach(imprimirImpares);
        
    }
}
