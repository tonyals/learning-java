package br.com.tony.challenges;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * For a number X, let its "Coolness" be defined as the number of "101"s occurring in its binary representation.
 * For example, the number 21 has Coolness 2, since its binary representation is 10101, and the string "101"
 * occurs twice in this representation.
 * A number is defined as Very Cool if its Coolness is greater than or equal to K.
 * Please, output the number of Very Cool integers between 1 and R.
 *
 * */
public class VeryCoolNumbers {
    public static void main(String[] args) {
        System.out.println(verifyVeryCool(500000, 5));
    }

    public static int verifyVeryCool(int r, int k) {
        AtomicInteger count = new AtomicInteger();
        //  Cria uma representacao do minimo de vezes que 101 deve aparecer na representacao binária
        String stringToCompare = "101".concat("01".repeat(k - 1));

        //  Gera uma lista de inteiros que vai de 1 ate R (inclusivo) mas somente com valores
        //  onde a representacao binaria tenha no minimo a quantidade de digitos do binario a ser
        //  buscado.
        List<Integer> integerList = generateList(r, stringToCompare.length());

        //  Cria um hashmap de tamanho R
        Map<String, Integer> hashValues = new HashMap<>(r);

        //  Preenche o hashmap com a representacao binária dos numeros de 1 ate R
        integerList.forEach(n -> hashValues.put(Integer.toBinaryString(n), n));

        //  Percorre o hashmap buscando os valores que possuem a representacao minima de 101
        hashValues.forEach((key, value) -> {
            if (key.contains(stringToCompare)) {
                count.getAndIncrement();
            }
        });

        return count.get();
    }

    /**
     * Gera uma lista de valores de 1 ate range, mas somente com representacoes binarias capazes
     * de atender ao requisito minimo de 101
     */
    public static List<Integer> generateList(int range, int minimumBinaryRep) {

        List<Integer> list = new ArrayList<>(range - 1);

        for (int i = 1; i <= range; i++) {
            list.add(i);
        }
        return list.stream()
                .filter(integer -> Integer.toBinaryString(integer).length() >= minimumBinaryRep)
                .toList();
    }
}
