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

        public Node getFather() {

            return father;
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
        Node n = new Node(element);
        Node nAux = null;
        boolean res = false;
        if (father == null) {
            if (position == NodePosition.LEFT) {
                n.setLeft(refRoot);
            } else {
                n.setRight(refRoot);
            }
            if (refRoot != null) {
                refRoot.setFather(n);
            }

            refRoot = n;
            res = true;
            this.totalElementos++;
        } else {
            nAux = searchNodeRef(father, refRoot);
            if (nAux != null) {
                n.setFather(nAux);
                if (position == NodePosition.LEFT) {
                    n.setLeft(nAux.getLeft());
                    if (nAux.getLeft() != null) {
                        nAux.getLeft().setFather(n);
                    }
                    nAux.setLeft(n);
                } else {
                    n.setRight(nAux.getRight());
                    if (nAux.getRight() != null) {
                        nAux.getRight().setFather(n);
                    }
                    nAux.setRight(n);
                }
                res = true;
                this.totalElementos++;
            }
        }
        return res;
    }

    @Override
    public boolean removeBranch(E element) {
        List<E> nroRemove = new ArrayList<E>();
        if (refRoot != null && getRoot().equals(element)) {
            refRoot = null;
            return true;
        }
        Node res = searchNodeRef(element);
        if (res == null) {
            return false;
        }
        if (res.getElement().equals(element)) {
            if (res.getFather().getLeft() == res) {
                res.getFather().setLeft(null);
            } else if (res.getFather().getRight() == res) {
                res.getFather().setRight(null);
            }
            traversalPre(res, nroRemove);
            this.totalElementos = this.totalElementos - nroRemove.size();
            return true;
        }
        return false;
    }

    @Override
    public E set(E old, E element) {
        Node res = searchNodeRef(old);
        if (res == null) {
            return null;
        }
        if (res.getElement().equals(old)) {
            res.setElement(element);
            return res.getElement();
        }
        return null;
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
        if (getRoot() != null) {

            setRoot(element);
        }
    }

    @Override
    public E getLeft(E element) {
        Node aux = searchNodeRef(element);
        if (isEmpty()) {
            return null;
        } else if (aux.getElement().equals(element)) {
            return aux.getLeft().getElement();
        } else {
            return null;
        }
    }

    @Override
    public E getRight(E element) {
        Node aux = searchNodeRef(element);
        if (isEmpty()) {
            return null;
        } else if (aux.getElement().equals(element)) {
            return aux.getRight().getElement();
        } else {
            return null;
        }
    }

    @Override
    public E getFather(E element) {
        Node aux = searchNodeRef(element);
        if (isEmpty()) {
            return null;
        } else if (aux.getElement().equals(element)) {
            return aux.getFather().getElement();
        } else {
            return null;
        }
    }

    @Override
    public boolean contains(E element) {
        Node aux = searchNodeRef(element);
        if (aux == null) {
            return false;
        } else if (aux.getElement().equals(element)) {
            return true;
        } else {
            return false;
        }
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
        List<E> countFolhas = new ArrayList<E>();
        count(refRoot, countFolhas);
        return countFolhas.size();
    }

    @Override
    public int height() {
        if (this.isEmpty()) {
            return 0;
        } else {
            Node res = refRoot;
            return alturaArvore(res);
        }
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
        List<E> res = new ArrayList<E>();
        traversalPre(refRoot, res);
        return res;
    }

    @Override
    public List<E> traversalPos() {
        List<E> res = new ArrayList<E>();
		traversalPos(refRoot, res);
		return res;
    }

    @Override
    public List<E> traversalCentral() {
        List<E> res = new ArrayList<E>();
		traversalCentral(refRoot, res);
		return res;
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

    private Node searchNodeRef(E element) {
        return searchNodeRef(element, refRoot);
    }

    private Node searchNodeRef(E element, Node target) {
        Node res = null;
        if ((target != null) && (element != null)) {
            if (target.getElement().equals(element)) {
                res = target;
            } else {
                res = searchNodeRef(element, target.getLeft());
                if (res == null) {
                    res = searchNodeRef(element, target.getRight());
                }
            }
        }
        return res;
    }

    private void traversalPre(Node element, List<E> res) {
        if (element != null) {
            res.add(element.getElement());
            traversalPre(element.getLeft(), res);
            traversalPre(element.getRight(), res);
        }

    }

    private int alturaArvore(Node count) {
        int alturaLeft = 0;
        int alturaRight = 0;
        if (count.left != null) {
            alturaLeft = alturaArvore(count.left);
        }
        if (count.right != null) {
            alturaRight = alturaArvore(count.right);
        }
        if (alturaLeft > alturaRight) {
            return alturaLeft + 1;
        } else {
            return alturaRight + 1;
        }
    }
    
    private void traversalPos(Node element, List<E> res) {
		if (element != null) {
			traversalPos(element.getLeft(), res);
			traversalPos(element.getRight(), res);
			res.add(element.getElement());
		}

	}
    
    private void traversalCentral(Node element, List<E> res) {
		if (element != null) {
			traversalCentral(element.getLeft(), res);
			res.add(element.getElement());
			traversalCentral(element.getRight(), res);
		}

	}

}
