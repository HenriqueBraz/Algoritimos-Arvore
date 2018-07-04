/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henrique
 */
public class BinaryTreeLinkedTest {
    
    public BinaryTreeLinkedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class BinaryTreeLinked.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        Object father = null;
        NodePosition position = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        boolean expResult = false;
        boolean result = instance.add(element, father, position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBranch method, of class BinaryTreeLinked.
     */
    @Test
    public void testRemoveBranch() {
        System.out.println("removeBranch");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        boolean expResult = false;
        boolean result = instance.removeBranch(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class BinaryTreeLinked.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object old = null;
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        Object expResult = null;
        Object result = instance.set(old, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoot method, of class BinaryTreeLinked.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        Object expResult = null;
        Object result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoot method, of class BinaryTreeLinked.
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        instance.setRoot(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeft method, of class BinaryTreeLinked.
     */
    @Test
    public void testGetLeft() {
        System.out.println("getLeft");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        Object expResult = null;
        Object result = instance.getLeft(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRight method, of class BinaryTreeLinked.
     */
    @Test
    public void testGetRight() {
        System.out.println("getRight");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        Object expResult = null;
        Object result = instance.getRight(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFather method, of class BinaryTreeLinked.
     */
    @Test
    public void testGetFather() {
        System.out.println("getFather");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        Object expResult = null;
        Object result = instance.getFather(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class BinaryTreeLinked.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class BinaryTreeLinked.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class BinaryTreeLinked.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countLeaves method, of class BinaryTreeLinked.
     */
    @Test
    public void testCountLeaves() {
        System.out.println("countLeaves");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        int expResult = 0;
        int result = instance.countLeaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class BinaryTreeLinked.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of level method, of class BinaryTreeLinked.
     */
    @Test
    public void testLevel() {
        System.out.println("level");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        int expResult = 0;
        int result = instance.level(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BinaryTreeLinked.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRoot method, of class BinaryTreeLinked.
     */
    @Test
    public void testIsRoot() {
        System.out.println("isRoot");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        boolean expResult = false;
        boolean result = instance.isRoot(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeave method, of class BinaryTreeLinked.
     */
    @Test
    public void testIsLeave() {
        System.out.println("isLeave");
        Object element = null;
        BinaryTreeLinked instance = new BinaryTreeLinked();
        boolean expResult = false;
        boolean result = instance.isLeave(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traversalPre method, of class BinaryTreeLinked.
     */
    @Test
    public void testTraversalPre() {
        System.out.println("traversalPre");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        List expResult = null;
        List result = instance.traversalPre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traversalPos method, of class BinaryTreeLinked.
     */
    @Test
    public void testTraversalPos() {
        System.out.println("traversalPos");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        List expResult = null;
        List result = instance.traversalPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traversalCentral method, of class BinaryTreeLinked.
     */
    @Test
    public void testTraversalCentral() {
        System.out.println("traversalCentral");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        List expResult = null;
        List result = instance.traversalCentral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traversalWidth method, of class BinaryTreeLinked.
     */
    @Test
    public void testTraversalWidth() {
        System.out.println("traversalWidth");
        BinaryTreeLinked instance = new BinaryTreeLinked();
        List expResult = null;
        List result = instance.traversalWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
