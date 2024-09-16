package tp2;

public class main {	
	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();	
		list.addElement(128);
		list.addElement(64);
		list.addElement(32);
		list.addElement(16);
		list.addElement(8);
		list.addElement(4);
		list.addElement(2);
		list.addElement(1);
		list.showList();
		System.out.print("\nAvant dernier : ");
		System.out.println(list.findSecondLast().getElement());
		list.reverse();
		list.showList();
		list.reverse();
		list.exchange(list.getHead().getNext().getNext(), list.findSecondLast());
		list.showList();
	}
}
