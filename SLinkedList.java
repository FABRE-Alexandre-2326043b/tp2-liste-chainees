package tp2;

/** Liste simplement chainée */
public class SLinkedList {
    private Node head; // noeud tête de la liste
    private long size; // nombre de noeuds de la liste

    /** Constructeur par défaut, qui crée une liste vide */
    public SLinkedList() {
        head = null;
        size = 0;
    }
	
    public void addElement(int newElement) {
    	Node newElem = new Node(newElement,this.head);
    	this.head = newElem;
    	size+=1;
    }
    
    public Node findPrevious(Node x) {
	Node target = this.head;
	if (target == null || target == x) return null;
	while(target.getNext() != x) {
	    target = target.getNext();
	}
	return target;
    }
    
    public Node findSecondLast() {
    	Node target = this.head;
    	while(target.getNext().getNext() != null) {
    		target = target.getNext();
    	}
    	return target;
    }
    
    public void showList() {
    	head.showElement();
    	showList(head.getNext());
    }
    
    public void showList(Node elem) {
    	if (elem!=null) {
        	elem.showElement();
    		showList(elem.getNext());
    	}    	
    }
    
    public void reverse() {
    	if(this.head!=null) {
    		Node elem = this.head;
			Node next = elem.getNext();
			elem.setNext(null);
			Node previous = elem;
			elem = next;
	    	while (next!=null) {
	    		next = elem.getNext();
	    		elem.setNext(previous);
	    		previous = elem;
	    		elem = next;
	    	}
	    	this.head=previous;
    	}    	
    }
    
    /*faire pointer le noeud avant x vers y, 
    faire pointer le noeud avant y vers x, 
    faire pointer y vers le suivant de x
    faire pointer x vers le suivant de y*/
    public void exchange(Node x, Node y) {
    if (x == y) return; 

    Node prevX = findPrevious(x);
    Node prevY = findPrevious(y);
    
    if (x == head) {
        head = y;
    } else {
        prevX.setNext(y);
    }
    
    if (y == head) {
        head = x;
    } else {
        prevY.setNext(x);
    }

    Node temp = x.getNext();
    x.setNext(y.getNext());
    y.setNext(temp);
    }


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
	System.out.println("\nListe à l'envers : ");	
	list.reverse();
	list.showList();
	list.reverse();
	list.exchange(list.head.getNext().getNext(), list.findSecondLast());
	System.out.print("\nListe avec 4 et 64 et leurs références inversées : ");
	list.showList();
    }
}








