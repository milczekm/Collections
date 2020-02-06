import java.util.*;

public class Kolekcje {

    public static void main (String[] args) {
        List<String> lista = new ArrayList<>();

        System.out.println("Rozmiar list: " + lista.size());

        lista.add("Tomek");
        lista.add("Kasia");
        lista.add("Magda");
        lista.add("Wika");
        lista.add("Pola");
        lista.add("Marcin");

        System.out.println("Czy lista jest pusta? " + lista.isEmpty());

        System.out.println("Cała lista: " + lista);
        System.out.println("Rozmiar listy: " + lista.size());
        System.out.println("Wartość listy pod indeksem 2 to: " + lista.get(2));

        System.out.println("Czy lista zawiera imię Pola? " + lista.contains("Pola"));
        System.out.println("Czy lista zawiera imię Janusz? " + lista.contains("Janusz"));

        lista.clear();
        System.out.println("Lista po wywołaniu metody clear(): " + lista);

        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(6);
        set.add(8);
        set.add(5);
        set.add(2);

        System.out.println("Zbiór (bez elementów powtarzających się): " + set);

        System.out.print("Przeglądanie całego zbioru HashSet pętlą forEach: ");

        for(Integer obiekt : set) {
            System.out.print(obiekt + " ");
        }

        Set<Integer> set2 = new TreeSet<>();

        set2.add(5);
        set2.add(7);
        set2.add(6);
        set2.add(4);

        System.out.println();
        System.out.println("TreeSet (zbiór uporządkowany): " + set2);

        Map<String, Integer> oceny = new HashMap<>();

        oceny.put("Matematyka", 5);
        oceny.put("Angielski", 4);
        oceny.put("Polski", 3);

        System.out.print("HashMap (tj. nieposortowana): ");
        System.out.println(oceny);

        Map<String, Integer> oc = new LinkedHashMap<>();

        System.out.print("LinkedHashMap (tj. posortowana): ");

        oc.put("Matematyka", 5);
        oc.put("Angielski", 4);
        oc.put("Polski", 3);

        System.out.println(oc);

        System.out.print("Wartość klucza 'Matematyka': ");
        System.out.println(oceny.get("Matematyka"));

        System.out.print("Wartości kolejnych klkuczy mapy: ");

        for(String klucz : oceny.keySet()){
            System.out.print(oceny.get(klucz) + " ");
        }

    }

}
