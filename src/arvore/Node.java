/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author Henrique
 */
public class Node<E> {
    
    private E valor;
    private Node Left;
    private Node Right;
    private Node Father;
    
    
    public Node(){
      
    }
    

    public void setLeft(Node LEFT) {
        this.Left = LEFT;
    }

    public void setRight(Node RIGHT) {
        this.Right = RIGHT;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public void setFather(Node Father) {
        this.Father = Father;
    }

    public E getValor() {
        return valor;
    }

    public Node getLeft() {
        return Left;
    }

    public Node getRight() {
        return Right;
    }

    public Node getFather() {
        return Father;
    }
    
   
    
    
}
    
    

