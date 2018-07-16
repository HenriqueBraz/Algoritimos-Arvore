package arvore;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeLinkedTest {

    BinaryTreeTAD<String> tree = new BinaryTreeLinked<>();

    @org.junit.Test
    public void add() {

        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        assertEquals("Deve conter valor 1: ", true, tree.contains("2"));
        tree.removeBranch("1");
        tree.removeBranch("2");
    }

    @org.junit.Test
    public void removeBranch() {

        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        assertEquals("Deve retornar 3",3, tree.size());
        tree.removeBranch("3");
        assertEquals("Deve retornar 2",2, tree.size());
        tree.removeBranch("2");
        assertEquals("Deve retornar 1",1, tree.size());

    }

    @org.junit.Test
    public void set() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.set("3","4");
		assertFalse(tree.contains("3"));
		assertEquals(true, tree.contains("4"));
    }

    @org.junit.Test
    public void getRoot() {
		tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
		assertEquals("O pai devera ser o elemento 1: ", "1", tree.getRoot());
    }

    @org.junit.Test
    public void setRoot() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.setRoot("0");
        assertEquals("O pai devera ser o elemento 0: ", "0", tree.getRoot());
    }

    @org.junit.Test
    public void getLeft() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        assertEquals("Deve ser o elemento 2: ", "2", tree.getLeft("1"));
    }

    @org.junit.Test
    public void getRight() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        assertEquals("Deve ser o elemento 3: ", "3", tree.getRight("1"));
    }

    @org.junit.Test
    public void getFather() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.add("4", "2", NodePosition.LEFT);
        assertEquals("Deve ser o elemento 2: ", "2", tree.getFather("4"));
    }

    @org.junit.Test
    public void contains() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        assertEquals(true, tree.contains("2"));
    }

    @org.junit.Test
    public void size() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);

        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        assertEquals("Deve retornar 6: ", 6, tree.size());
    }

    @org.junit.Test
    public void count() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);

        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        assertEquals("Deve retornar 6: ", 6, tree.count());
    }

    @org.junit.Test
    public void countLeaves() {

        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);

        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        assertEquals("Deve retornar 3: ", 3, tree.countLeaves());
    }

    @org.junit.Test
    public void height() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);

        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        tree.add("7", "4", NodePosition.LEFT);
        assertEquals("Deve retornar 5: ", 5, tree.height());
    }

    @org.junit.Test
    public void level() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);

        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        tree.add("7", "4", NodePosition.RIGHT);
        assertEquals("Deve retornar 3: ", 3, tree.level("5"));
    }

    @org.junit.Test
    public void isEmpty() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);

        tree.removeBranch("11");

        assertEquals("Deve retornar true: ", 3, tree.size());
    }

    @org.junit.Test
    public void isRoot() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);


        assertEquals("Deve retornar true: ", true, tree.isRoot("1"));
    }

    @org.junit.Test
    public void isLeave() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);


        assertEquals("Deve retornar true: ", true, tree.isLeave("3"));
    }

    @org.junit.Test
    public void traversalPre() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        tree.add("7", "4", NodePosition.RIGHT);
        tree.add("8", "5", NodePosition.LEFT);
        tree.add("9", "5", NodePosition.RIGHT);

        ArrayList<String> result = new ArrayList<>();
        result.add("1");
        result.add("2");
        result.add("4");
        result.add("6");
        result.add("7");
        result.add("5");
        result.add("8");
        result.add("9");
        result.add("3");

        assertEquals("Deve retornar 1,2,3: ", result, tree.traversalPre());
    }

    @org.junit.Test
    public void traversalPos() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        tree.add("7", "4", NodePosition.RIGHT);
        tree.add("8", "5", NodePosition.LEFT);
        tree.add("9", "5", NodePosition.RIGHT);

        ArrayList<String> result = new ArrayList<>();
        result.add("6");
        result.add("7");
        result.add("4");
        result.add("8");
        result.add("9");
        result.add("5");
        result.add("2");
        result.add("3");
        result.add("1");

        assertEquals("Deve retornar 2,3,1: ", result, tree.traversalPos());
    }

    @org.junit.Test
    public void traversalCentral() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        tree.add("7", "4", NodePosition.RIGHT);
        tree.add("8", "5", NodePosition.LEFT);
        tree.add("9", "5", NodePosition.RIGHT);

        ArrayList<String> result = new ArrayList<>();
        result.add("6");
        result.add("4");
        result.add("7");
        result.add("2");
        result.add("8");
        result.add("5");
        result.add("9");
        result.add("1");
        result.add("3");

        assertEquals("Deve retornar 2,1,3: ", result, tree.traversalCentral());
    }

    @org.junit.Test
    public void traversalWidth() {
        tree.add("1", null, NodePosition.LEFT);
        tree.add("2", "1", NodePosition.LEFT);
        tree.add("3", "1", NodePosition.RIGHT);
        tree.add("4", "2", NodePosition.LEFT);
        tree.add("5", "2", NodePosition.RIGHT);
        tree.add("6", "4", NodePosition.LEFT);
        tree.add("7", "4", NodePosition.RIGHT);
        tree.add("8", "5", NodePosition.LEFT);
        tree.add("9", "5", NodePosition.RIGHT);

        ArrayList<String> result = new ArrayList<>();
        result.add("1");
        result.add("2");
        result.add("3");
        result.add("4");
        result.add("5");
        result.add("6");
        result.add("7");
        result.add("8");
        result.add("9");

        assertEquals("Deve retornar 1,2,3: ", result, tree.traversalWidth());
    }
}