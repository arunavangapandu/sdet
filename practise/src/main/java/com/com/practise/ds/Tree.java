package com.com.practise.ds;

public class Tree {

    private Node root; // only data field in tree

    public Node find(int key) {
       Node current = root;
       while(current != null && current.data != key) {
           if(key < current.data)
               current = current.leftChild;
           else
               current = current.rightChild;
           if(current == null)
               return null;
       }
        return current;
    }

    public void insert(int key) {
        Node newNode = new Node(key);
        if(root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(key < current.data) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return ;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }
    }
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.data != key) {
            parent = current;
            if (key < current.data) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        } // end while
        // found node to delete
        if(current.leftChild == null &&
                current.rightChild == null) {
            if(current == root) { // if root,
                root = null ;  // tree is empty
            } else if(isLeftChild)
                parent.leftChild =  null;
            else
                parent.rightChild = null;
        }
        return true;
    }

}