/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author 17120069
 */
public class Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        	@Test
	public void Add1() {
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.RIGHT);
		myTree.add("3", "2", NodePosition.LEFT);
		assertEquals("Deve conter valor 1: ", true, myTree.contains("1"));
		assertEquals("Não Deve conter valor 4: ", false, myTree.contains("4"));
		assertEquals("Deve conter 4 elementos: ", 4, myTree.size());
		assertEquals("Deve conter 4 elementos: ", 4, myTree.count());
		myTree.removeBranch("3");
		assertEquals("Não deve conter o 3", false, myTree.contains("3"));
	}

	@Test
	public void Add2(){
		String x = "1";
		String y = "3";
		myTree.add(x, null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.RIGHT);
		myTree.add(y, x, NodePosition.LEFT);
		assertEquals("Deve conter valor 1: ", true, myTree.contains("1"));
	}
	
	@Test
	public void Remove(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve conter valor 6: ", 6, myTree.count());
		myTree.removeBranch("2");
		assertEquals("Deve conter valor 2: ", 2, myTree.size());
		myTree.removeBranch(myTree.getRoot());
		assertEquals("Não deve conter valor 1: ", false, myTree.contains("1"));
	}
	
	@Test
	public void set(){
		myTree.setRoot("1");
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar 7: ", "7", myTree.set("3", "7"));
		assertEquals("Deve retornar null: ", null, myTree.set("0", "8"));
		myTree.setRoot("8");
		assertEquals("Deve retornar 8: ", "8", myTree.getRoot());
	}
	
	@Test
	public void get(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar 1:", "1",myTree.getFather("2"));
		assertEquals("Deve retornar 2:", "2",myTree.getFather("4"));
		assertEquals("Deve retornar 6:", "6",myTree.getLeft("3"));
		assertEquals("Deve retornar 3:", "3",myTree.getLeft("2"));
		assertEquals("Deve retornar 5:", "5",myTree.getRight("1"));
		assertEquals("Deve retornar 4:", "4",myTree.getRight("2"));
	}
	
	@Test
	public void getFail(){
		myTree.getRoot();
	}
	
	@Test
	public void setFail(){
		myTree.setRoot("3");
	}
	
	@Test
	public void contains(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar 1:", true, myTree.contains("1"));
		assertEquals("Deve retornar 6:", false, myTree.contains("9"));
		assertEquals("Deve retornar 3:", true, myTree.contains("3"));
	}
	
	@Test
	public void sizeCount(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar 6:", 6, myTree.size());
		assertEquals("Deve retornar 6:", 6, myTree.count());
		myTree.removeBranch("5");
		assertEquals("Deve retornar 5:", 5, myTree.size());
		assertEquals("Deve retornar 5:", 5, myTree.count());
	}
	
	@Test
	public void leaves(){
		assertEquals("Deve retornar 0", 0, myTree.countLeaves());
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar false", false, myTree.isLeave("1"));
		assertEquals("Deve retornar true", true, myTree.isLeave("4"));
		assertEquals("Deve retornar 3", 3, myTree.countLeaves());
	}
	
	@Test
	public void height(){
		assertEquals("Deve retornar 0", 0, myTree.height());
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar 4", 4, myTree.height());
	}
	
	@Test
	public void level(){
		assertEquals("Deve retornar falso(-1)", -1, myTree.level("1"));
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		assertEquals("Deve retornar 3", 3, myTree.level("4"));
		assertEquals("Deve retornar 1", 1, myTree.level("1"));
		assertEquals("Deve retornar 4", 4, myTree.level("6"));
	}
	
	@Test
	public void isEmpty(){
		assertEquals("Deve retornar true", true, myTree.isEmpty());
		myTree.add("1", null, NodePosition.LEFT);
		assertEquals("Deve retornar false", false, myTree.isEmpty());
	}
	
	@Test
	public void isRoot(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		assertEquals("Deve retornar true", true, myTree.isRoot("1"));
		assertEquals("Deve retornar false", false, myTree.isRoot("2"));
	}
	
	@Test
	public void traversalPre(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		List<String> test = myTree.traversalPre();
		assertEquals("O primeiro elemento é 1:", "1", test.get(0));
		assertEquals("O segundo elemento é 2:", "2", test.get(1));
		assertEquals("O terceiro elemento é 3:", "3", test.get(2));
		assertEquals("O quarto elemento é 6:", "6", test.get(3));
		assertEquals("O quinto elemento é 4:", "4", test.get(4));
		assertEquals("O sexto elemento é 5:", "5", test.get(5));
	}
	
	@Test
	public void traversalPos(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		List<String> test = myTree.traversalPos();
		assertEquals("O primeiro elemento é 6:", "6", test.get(0));
		assertEquals("O segundo elemento é 3:", "3", test.get(1));
		assertEquals("O terceiro elemento é 4:", "4", test.get(2));
		assertEquals("O quarto elemento é 2:", "2", test.get(3));
		assertEquals("O quinto elemento é 5:", "5", test.get(4));
		assertEquals("O sexto elemento é 1:", "1", test.get(5));
	}
	
	@Test
	public void traversalCentral(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		List<String> test = myTree.traversalCentral();
		assertEquals("O primeiro elemento é 6:", "6", test.get(0));
		assertEquals("O segundo elemento é 3:", "3", test.get(1));
		assertEquals("O terceiro elemento é 2:", "2", test.get(2));
		assertEquals("O quarto elemento é 4:", "4", test.get(3));
		assertEquals("O quinto elemento é 1:", "1", test.get(4));
		assertEquals("O sexto elemento é 5:", "5", test.get(5));
	}
	
	@Test
	public void traversalWidth(){
		myTree.add("1", null, NodePosition.LEFT);
		myTree.add("2", "1", NodePosition.LEFT);
		myTree.add("3", "2", NodePosition.LEFT);
		myTree.add("4", "2", NodePosition.RIGHT);
		myTree.add("5", "1", NodePosition.RIGHT);
		myTree.add("6", "3", NodePosition.LEFT);
		List<String> test = myTree.traversalWidth();
		assertEquals("O primeiro elemento é 1:", "1", test.get(0));
		assertEquals("O segundo elemento é 2:", "2", test.get(1));
		assertEquals("O terceiro elemento é 5:", "5", test.get(2));
		assertEquals("O quarto elemento é 3:", "3", test.get(3));
		assertEquals("O quinto elemento é 4:", "4", test.get(4));
		assertEquals("O sexto elemento é 6:", "6", test.get(5));
	}
	@Test
	public void getRoot(){
		myTree.add("0", null, NodePosition.LEFT);
		myTree.add("1", "0", NodePosition.LEFT);
		myTree.add("2", "0", NodePosition.RIGHT);
		myTree.add("3", "2", NodePosition.RIGHT);
		assertEquals("O pai deverah ser o elemento 0: ", "0", myTree.getRoot());
	}
	@Test
	public void setRoot(){
		myTree.add("0", null, NodePosition.LEFT);
		myTree.add("1", "0", NodePosition.LEFT);
		myTree.add("2", "0", NodePosition.RIGHT);
		myTree.add("3", "2", NodePosition.RIGHT);
		myTree.setRoot("4");
		assertEquals("O pai deverah ser o elemento 4: ", "4", myTree.getRoot());
	}
	@Test
	public void isRoot1(){
		myTree.add("0", null, NodePosition.LEFT);
		myTree.add("1", "0", NodePosition.LEFT);
		myTree.add("2", "0", NodePosition.RIGHT);
		myTree.add("3", "2", NodePosition.RIGHT);
		assertEquals("O pai é 0: ", true, myTree.isRoot("0"));
		assertEquals("O pai é 0: ", false, myTree.isRoot("8"));
	}
	public void isLeave(){
		myTree.add("0", null, NodePosition.LEFT);
		myTree.add("1", "0", NodePosition.LEFT);
		myTree.add("2", "0", NodePosition.RIGHT);
		myTree.add("3", "2", NodePosition.RIGHT);
		assertEquals("O 1 é folha", true, myTree.isLeave("1"));
		assertEquals("O 1 é folha", false, myTree.isLeave("2"));
	}
    }
    
}
