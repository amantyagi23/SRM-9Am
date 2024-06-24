import java.util.ArrayList;
import java.util.List;

public class ImplementationOfGraph {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int V = 5;
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(4).add(3);
        graph.get(3).add(4);
        graph.get(0).add(4);

        for (int i = 0; i < V; i++) {
            System.out.print(i + " [ ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + ", ");
            }
            System.out.println(" ] ");
        }
    }
}
