package teste1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int vetor[] = new int[] {5,5,5,5};
        int maior = maiorNumero(vetor);
        System.out.println(maior);
        /*
        Dada uma lista de números inteiros, implemente uma função que determine o maior
        número que aparece apenas uma vez na lista.
        Se todos os números aparecem mais de uma vez, a função deve retornar null (ou
                equivalente na linguagem escolhida).
        🔥 Exemplos:
        ● [1, 2, 2, 3, 4, 4] → 3
        ● [5, 5, 5, 5] → null
        ● [7, 8, 9, 7, 9] → 8
        ● [10, 20, 30] → 30

*/
    }
        public static int maiorNumero(int [] lista){
            Map<Integer, Integer> indices = new HashMap<>();
            for(int i = 0; i< lista.length;i++){
                indices.put(lista[i],indices.getOrDefault(lista[i], 0)+1);
            }
            int maior = 0;
            for(int i = 0; i < lista.length;){

                for(int index : indices.keySet()) {
                    System.out.println(indices.get(index));
                    System.out.println("index: " + index);
                    if (indices.get(index) == 1) {
                        if (index > maior) {
                            maior = index;
                        }


                    }
                    i++;
                }
            }
            if(maior == 0){
                return -1;
            }
            return maior;
        }


}