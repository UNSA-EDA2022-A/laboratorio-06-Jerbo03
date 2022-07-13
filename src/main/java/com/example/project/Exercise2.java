package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }
    
    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
        return bstIguales(a1.root, a2.root);
    }
    
    public <T extends Comparable<T>> boolean bstIguales(Node<T> a1, Node<T> a2){
        if (a1 == null || a2 == null) return (a1 == null && a2 == null);
        return (a1.data.compareTo(a2.data) == 0) && bstIguales(a1.left, a2.left) && bstIguales(a1.right, a2.right);
    }
}
