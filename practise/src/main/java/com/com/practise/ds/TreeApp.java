package com.com.practise.ds;

public class TreeApp {

    public static void main(String[] args) {

        Tree theTree = new Tree(); // make a tree

        theTree.insert(101);
        theTree.insert(102);  // insert 3 nodes
        theTree.insert(103);

       Node found = theTree.find(101); // find node with the given key

        if(found != null) {
            System.out.println("Found the node with  the given key");
        } else {
            System.out.println("could not find the node");
        }
    }
}
