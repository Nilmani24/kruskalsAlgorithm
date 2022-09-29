package com;

public class Edge implements Comparable<Edge>{
    int startNode;
    int endNode;
    int weight;

    public Edge(int startNode, int endNode, int weight) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "startNode=" + startNode +
                ", endNode=" + endNode +
                ", weight=" + weight +
                '}';
    }
}
