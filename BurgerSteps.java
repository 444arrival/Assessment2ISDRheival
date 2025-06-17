import java.util.*;

public class BurgerSteps {
    private Map<String, Integer> jarak;

    public BurgerSteps() {
        jarak = new HashMap<>();
        isiJarak();
    }

    private void isiJarak() {
        jarak.put("preheat oven", 0);
        jarak.put("bake bread", 1);
        jarak.put("serve bread", 1);
        jarak.put("add tartar sauce", 2);
        jarak.put("preheat pan", 2);
        jarak.put("set plate", 3);
        jarak.put("add some pickles", 3);
        jarak.put("serve patty", 4);
        jarak.put("pour sauce over patty", 5);
        jarak.put("add krabby patty", 6);
        jarak.put("eat", 7);
    }

    public void printUrutanMenjauh() {
        System.out.println("Urutan menjauh:");
        jarak.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.print(entry.getKey() + " -> "));
        System.out.println("Selesai.");
    }
}
