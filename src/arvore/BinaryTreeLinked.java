/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * int[] vet
 *
 * @author 17120069
 * @param <E>
 */
public class BinaryTreeLinked<E> implements BinaryTreeTAD<E> {

    private Node refRoot;
    private int totalElementos;

    private class Node {

        private E element;
        private Node left, right, father;

        public Node(E e) {
            element = e;
            setFather(null);
            setLeft(null);
            setRight(null);
        }

        public void setElement(E e) {
            element = e;
        }

        public E getElement() {
            return element;
        }

        public void setFather(Node novo) {
            father = novo;
        }

        public void setLeft(Node novo) {
            left = novo;

        }

        public void setRight(Node novo) {
            right = novo;

        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    @Override
    public boolean add(E element, E father, NodePosition position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeBranch(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(E old, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getRoot() {

        if (isEmpty()) {
            throw new EmptyTreeException();
        } else {
            return refRoot.getElement();
        }
    }

    @Override
    public void setRoot(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLeft(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getRight(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFather(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {

        return totalElementos;
    }

    @Override
    public int count() {
        return traversalWidth().size();
    }

    @Override
    public int countLeaves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int height() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int level(E element) {
        Node aux = searchNodeRef(element);
        if (isEmpty()) {
            return -1;
        }
        int count = 0;
        while (aux.father != null) {
            count++;
            aux = aux.father;
        }
        return count + 1;

    }

    @Override
    public boolean isEmpty() {
        if (totalElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isRoot(E element) {
        if (refRoot.getElement() == element) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean isLeave(E element) {
        List<E> leaves = new ArrayList<>();
        Node aux = refRoot;
        count(aux, leaves);
        if (leaves.contains(element)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<E> traversalPre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> traversalPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> traversalCentral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> traversalWidth() {
        List<E> res = new ArrayList<E>();
        traversalWidth(refRoot, res);
        return res;
    }

    private void traversalWidth(Node element, List<E> res) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(element);
        if (element == null) {
            throw new IllegalArgumentException("Arvore vazia!");
        }
        while (!queue.isEmpty()) {
            Node aux = queue.poll();
            res.add(aux.getElement());
            if (aux.getLeft() != null) {
                queue.add(aux.getLeft());
            }
            if (aux.getRight() != null) {
                queue.add(aux.getRight());
            }
        }

    }

    private void count(Node contador, List<E> lst) {
        if (contador != null) {
            count(contador.getLeft(), lst);
            count(contador.getRight(), lst);
            if (contador.getRight() == null && contador.getLeft() == null) {
                lst.add(contador.getElement());
            }
        }
    }
        
        private Node searchNodeRef( E element){
		return searchNodeRef(element, refRoot);
	}
        
        private Node searchNodeRef(E element, Node target){
		Node res = null;
		if((target!=null) && (element!=null)){
			if(target.getElement().equals(element)){
				res = target;
			}
			else {
				res = searchNodeRef(element, target.getLeft());
				if(res == null){
					res = searchNodeRef(element, target.getRight());
				}
			}
		}
		return res;
	}
        
        
    
}
