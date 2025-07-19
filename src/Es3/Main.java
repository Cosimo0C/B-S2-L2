package Es3;

import java.util.HashMap;

public class Main {
    private static final HashMap<String, String> rubrica= new HashMap<>();
    public static void addNameNumber(String nome, String numero){
        rubrica.put(nome, numero);
    }
    public static  void deleteByName(String nome){
        rubrica.remove(nome);
    }
    public static void findByNumber(String numero){
        String risultato = "";
        for (String name : rubrica.keySet()){
            if (numero.equals(rubrica.get(name))){
                risultato=name;
            }
        }
        System.out.println(risultato);
    }
    public static void findNumeberByName(String nome){
        String numero= rubrica.get(nome);
        if (numero!=null) System.out.println(numero);
        else System.out.println("ERRORE");
    }
    public static void printRubrica(){
        for (String name : rubrica.keySet()){
            System.out.println("Nome: " + name + ", numero di telefono: " + rubrica.get(name));
        }
    }
    public static void main(String[] args) {
        try {
            addNameNumber("Cosimo", "3200517177");
            addNameNumber("Giada", "3284325279");
            addNameNumber("Marika", "3984539164");
            System.out.println("La rubrica adesso ha " + rubrica.size() + " numeri");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        deleteByName("Giada");
        System.out.println("La rubrica adesso ha " + rubrica.size() + " numeri");
        System.out.print("Il numero cercato è ");
        findByNumber("3200517177");
        System.out.print("Il nome cercato risale a " );
                findNumeberByName("Marika");
                printRubrica();

    }
}
