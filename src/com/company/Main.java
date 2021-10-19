package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        KNode root = new KNode('A');
        KNode Bnode = new KNode('B');
        KNode Cnode = new KNode('C');
        KNode Dnode = new KNode('D');
        KNode Enode = new KNode('E');
        KNode Fnode = new KNode('F');
        KNode Gnode = new KNode('G');
        KNode Hnode = new KNode('H');
        KNode Inode = new KNode('I');
        KNode Jnode = new KNode('J');
        KNode Knode = new KNode('K');
        KNode Lnode = new KNode('L');
        KNode Mnode = new KNode('M');
        KNode Nnode = new KNode('N');
        KNode Onode = new KNode('O');

        root.addNode(Bnode);
        root.addNode(Cnode);
        root.addNode(Dnode);

        Bnode.addNode(Enode);
        Bnode.addNode(Fnode);
        Bnode.addNode(Gnode);

        Cnode.addNode(Hnode);
        Cnode.addNode(Inode);
        Cnode.addNode(Jnode);

        Dnode.addNode(Knode);
        Dnode.addNode(Lnode);
        Dnode.addNode(Mnode);

        Enode.addNode(Nnode);
        Enode.addNode(Onode);


        root.traverse(root);
    }
}
