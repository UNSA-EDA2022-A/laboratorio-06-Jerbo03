package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
        if (a.isEmpty()) return false;
        return bstEstrictamenteBinario(a.root.right, a.root.left);
    }
    
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> r, Node<T> l){
        if (r == null || l == null) // Si alguno de los hijos es null
            return (r == null && l == null); // Solo sera estrictamente binario si ambos son hojas
        return bstEstrictamenteBinario(r.right, r.left) && bstEstrictamenteBinario(l.right, l.left); // Si ninguno es null, comparamos sus hijos
    }
}
