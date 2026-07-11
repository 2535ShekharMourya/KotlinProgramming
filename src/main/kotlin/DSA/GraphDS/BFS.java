package DSA.GraphDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge1 {
        int src;
        int dest;

        public Edge1(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createUndirectedAndUnweightedGraph(ArrayList<Edge1> graph[]) {
        /*for (int i=0;i<graph.length;i++){  then throw nullPointerException
            graph[i]=new ArrayList<Edge>();
        }*/
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge1>();
        }
        graph[0].add(new Edge1(0, 1));
        graph[0].add(new Edge1(0, 2));

        graph[1].add(new Edge1(1, 0));
        graph[1].add(new Edge1(1, 3));

        graph[2].add(new Edge1(2, 0));
        graph[2].add(new Edge1(2, 4));

        graph[3].add(new Edge1(3, 1));
        graph[3].add(new Edge1(3, 4));
        graph[3].add(new Edge1(3, 5));

        graph[4].add(new Edge1(4, 2));
        graph[4].add(new Edge1(4, 3));
        graph[4].add(new Edge1(4, 5));

        graph[5].add(new Edge1(5, 3));
        graph[5].add(new Edge1(5, 4));
        graph[5].add(new Edge1(5, 6));

        graph[6].add(new Edge1(6, 5));
    }

    public static void bfs(ArrayList<Edge1> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge1 e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge1> graph[] = new ArrayList[v];
        createUndirectedAndUnweightedGraph(graph);

        bfs(graph, v);
        System.out.println();
    }
}
