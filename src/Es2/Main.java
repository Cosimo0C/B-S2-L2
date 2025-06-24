package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Integer> listaRandom(int n){
        Random random= new Random();
        List<Integer> listaN =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numero= random.nextInt(101);
            listaN.add(numero);
        }
        Collections.sort(listaN);
        return listaN;
    }
    public static List<Integer> listaSort(List<Integer> array ){
        List<Integer> listaSor=new ArrayList<>();
        listaSor.addAll(array);
        for (int i = array.size()-1; i >= 0; i--) {
            listaSor.add(array.get(i));
        }
        return listaSor;
    }
    public static void main(String[] args) {
        System.out.println(listaRandom(10));
        System.out.println(listaSort(listaRandom(10)));
    }
}
