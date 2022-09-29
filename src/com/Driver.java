package com;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Edge> graph = new ArrayList<>();
        graph.add(new Edge(0,1,10));
        graph.add(new Edge(0,2,6));
        graph.add(new Edge(0,3,5));
        graph.add(new Edge(1,3,15));
        graph.add(new Edge(2,3,4));
        Kruskal kruskal = new Kruskal(graph,4);
        System.out.print(kruskal.kruskalAlgo());



    }
}
