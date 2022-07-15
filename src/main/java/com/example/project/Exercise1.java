package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }

    
    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
        return bstSimilares(a1.root, a2.root);
    }
    
    public <T extends Comparable<T>> boolean bstSimilares(Node<T> a1, Node<T> a2){
        if (a1 == null || a2 == null) return a1 == null && a2 == null; // Si alguna de las raices es null, ambas deben serlo para tener un bst similar
        // Si ninguna raiz es null
        return bstSimilares(a1.left, a2.left) && bstSimilares(a1.right, a2.right); // Comprobar que los subarboles tambien sean similares
    }
    
}
