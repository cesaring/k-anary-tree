package com.company;

import java.util.ArrayList;

public class KNode {
    private char value ;
    private ArrayList<KNode> nodeList ; //= new ArrayList<KNode>();

    public KNode(char value){
        this.value = value;
        this.nodeList = new ArrayList<KNode>();
    }


    public char getValue() {
        return value;
    }


    public ArrayList<KNode> getNodeList() {
        return this.nodeList;
    }

    public void addNode(KNode node){
        this.nodeList.add(node);
    }

    public void traverse(KNode node){
        char result;
        System.out.print(node.getValue());
        if (node.getNodeList().size()>0) {
            for(KNode n: node.nodeList){
            traverse(n);
            }
        }
        //System.out.print(node.getValue());

    }

}


