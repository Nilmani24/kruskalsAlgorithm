package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kruskal {

    List<Edge> graph ;
    List<Integer> parent;
    List<Integer> degree;
    int v;
    public Kruskal(List<Edge> graph,int v) {
        this.graph = graph;
        this.parent = new ArrayList<>(v);
        this.degree= new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            parent.add(-1);
            degree.add(1);
        }
        this.v = v;
    }

    private int getParent(int node){

        if(parent.get(node) == -1)
            return node;
        return parent.set(node,getParent(parent.get(node)));

    }

    public List<Edge> kruskalAlgo(){
        Collections.sort(graph);
        Collections.fill(parent,-1);
        List<Edge>  minimumSpanningTree = new ArrayList<>();
        for(int i =0;i<=v-1;i++){
            int first = getParent(graph.get(i).startNode);
            int second = getParent(graph.get(i).endNode);

            if(first != second){
                if(degree.get(first) > degree.get(second)){
                    parent.set(first,second);
                }else if(degree.get(second) > degree.get(first)){
                    parent.set(second,first);
                }else{
                    parent.set(first,second);
                    degree.set(first,degree.get(i)+1);
                }
                minimumSpanningTree.add(graph.get(i));
            }
        }
        return minimumSpanningTree;
    }

}
