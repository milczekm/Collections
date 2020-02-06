import java.util.*;

public class Kolekcje {

    public static void main (String[] args) {
        List<String> lista = new ArrayList<>();

        System.out.println(lista.size());

        lista.add("Tomek");
        lista.add("Kasia");
        lista.add("Magda");
        lista.add("Wika");
        lista.add("Pola");
        lista.add("Marcin");

        System.out.println("Czy lista jest pusta? " + lista.isEmpty());

        System.out.println(lista);
        System.out.println("Rozmiar listy: " + lista.size());
        System.out.println("Osoba pod indeksem 2 to: " + lista.get(2));

        System.out.println("Czy lista zawiera imię Pola?" + lista.contains("Pola"));
        System.out.println("Czy lista zawiera imię Janusz?" + lista.contains("Janusz"));

        lista.clear();
        System.out.println(lista);

        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(6);
        set.add(8);
        set.add(5);

        System.out.println(set);

        for(Integer obiekt : set) {
            System.out.print(obiekt + " ");
        }

        System.out.println(set);

        Set<Integer> set2 = new TreeSet<>();

        set2.add(5);
        set2.add(7);
        set2.add(1);

        System.out.println(set2);

        Map<String, Integer> oceny = new HashMap<>();

        oceny.put("Matematyka", 5);
        oceny.put("Angielski", 4);
        oceny.put("Polski", 3);

        System.out.println(oceny);

        Map<String, Integer> oc = new LinkedHashMap<>();

        oc.put("Matematyka", 5);
        oc.put("Angielski", 4);
        oc.put("Polski", 3);

        System.out.println(oc);

        System.out.println(oceny.get("Matematyka"));

        System.out.println("Wartości kolejnych klkuczy mapy: ");

        for(String klucz : oceny.keySet()){
            System.out.print(oceny.get(klucz) + " ");
        }

    }

}
