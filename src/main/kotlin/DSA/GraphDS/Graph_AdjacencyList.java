package DSA.GraphDS;

import java.util.ArrayList;

public class Graph_AdjacencyList {
    // Method 1 to implement Graph is AdjacencyList
    // for undirected and unweighted graph
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createUndirectedAndUnweightedGraph(ArrayList<Edge>graph[]){
        /*for (int i=0;i<graph.length;i++){  then throw nullPointerException
            graph[i]=new ArrayList<Edge>();
        }*/
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    static class Edge2{
        // for undirected and weighted graph
        int src;
        int dest;
        int wt;
        public Edge2(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    public static void createUndirectedAndweightedGraph(ArrayList<Edge2>graph[]){
        /*for (int i=0;i<graph.length;i++){  then throw nullPointerException
            graph[i]=new ArrayList<Edge>();
        }*/
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge2>();
        }
        graph[0].add(new Edge2(0,2,2));

        graph[1].add(new Edge2(1,2,10));
        graph[1].add(new Edge2(1,3,0));

        graph[2].add(new Edge2(2,0,2));
        graph[2].add(new Edge2(2,1,10));
        graph[2].add(new Edge2(2,3,-1));

        graph[3].add(new Edge2(3,1,0));
        graph[3].add(new Edge2(3,2,-1));
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];
        createUndirectedAndUnweightedGraph(graph);
        // print 2's neighbours
        for (int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();
        // print 1's neighbours
        for (int i=0;i<graph[1].size();i++){
            Edge e=graph[1].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();
        // print 3's neighbours
        for (int i=0;i<graph[3].size();i++){
            Edge e=graph[3].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();

        ArrayList<Edge2>graph2[]=new ArrayList[v];
        createUndirectedAndweightedGraph(graph2);
        for (int i=0;i<graph2[1].size();i++){
            Edge2 e=graph2[1].get(i);
            System.out.print( "[Edge ->"+e.dest +" weight ->"+e.wt+"]  ");
        }
        System.out.println();
        for (int i=0;i<graph2[2].size();i++){
            Edge2 e=graph2[2].get(i);
            System.out.print( "[Edge ->"+e.dest +" weight ->"+e.wt+"]  ");
        }
    }

}
