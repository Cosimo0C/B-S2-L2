package Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int N= Integer.parseInt(scanner.nextLine());
        Set<String> parole= new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        System.out.println("Inserisci "+N+" parole");
        for (int i = 0; i < N; i++) {
            String parola= scanner.nextLine();
            if (parole.contains(parola)){
                duplicate.add(parola);
        }else {
                parole.add(parola);
            }
        }
        System.out.println("Le parole duplicate "+ duplicate);
        System.out.println("Le parole distinte sono "+ parole.size()+ " e le parole sono " +parole);
    }
}
