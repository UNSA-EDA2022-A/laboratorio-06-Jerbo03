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
        if (a1.isempty() || a1.isempty()) return a1.isempty() && a1.isempty(); // Si alguna de las raices es null, ambas deben serlo para tener un bst similar
        // Si ninguna raiz es null
        BST<T> a1L = a1; a1L.root = a1L.left;   // Crear el sub arbol 1 izquierdo
        BST<T> a1R = a1; a1R.root = a1R.right;  // Crear el sub arbol 1 derecho
        BST<T> a2L = a2; a2L.root = a2L.left;   // Crear el sub arbol 2 izquierdo
        BST<T> a2R = a2; a2R.root = a2R.right;  // Crear el sub arbol 2 derecho
        return bstSimilares(a1L, a2L) && bstSimilares(a1R, a2R); // Y comprobar que los subarboles tambien sean similares
    }
    
}
