import java.util.*;

public class Graph {
    private Map<String, List<String>> graph;

    public Graph() {
        graph = new HashMap<>();
        buildGraph();
    }

    private void buildGraph() {
        graph.put("preheat oven", Arrays.asList("bake bread", "serve bread"));
        graph.put("bake bread", Arrays.asList("serve bread", "add tartar sauce"));
        graph.put("serve bread", Arrays.asList("add tartar sauce", "preheat pan"));
        graph.put("add tartar sauce", Arrays.asList("preheat pan", "set plate"));
        graph.put("preheat pan", Arrays.asList("set plate"));
        graph.put("set plate", Arrays.asList("add some pickles", "serve patty", "pour sauce over patty"));
        graph.put("add some pickles", Arrays.asList("serve patty", "pour sauce over patty"));
        graph.put("serve patty", Arrays.asList("add some pickles"));
        graph.put("pour sauce over patty", Arrays.asList("add krabby patty", "eat"));
        graph.put("add krabby patty", Arrays.asList("pour sauce over patty", "eat"));
        graph.put("eat", Arrays.asList("add krabby patty"));
    }

    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        System.out.println("Urutan Berdekatan :");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (!visited.contains(current)) {
                visited.add(current);
                System.out.print(current + " -> ");
                for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }

        System.out.println("Selesai.");
    }
}
