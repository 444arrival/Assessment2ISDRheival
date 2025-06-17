public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.bfs("preheat oven");

        System.out.println();

        BurgerSteps distanceManager = new BurgerSteps();
        distanceManager.printUrutanMenjauh();
    }
}
