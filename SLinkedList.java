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
    
    public Node getHead() {
    	return this.head;
    }

    public void addElement(int newElement) {
    	Node newElem = new Node(newElement,this.head);
    	this.head = newElem;
    	size+=1;
    }
    
    public Node findPrevious(Node x) {
    	Node target = this.head;
    	while(target.getNext() == x) {
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
    
    //faire pointer le noeud avant x vers y, 
    //faire pointer le noeud avant y vers x, 
    //faire pointer y vers le suivant de x
    //faire pointer x vers le suivant de y
    public void exchange(Node x, Node y) {
    	
    	findPrevious(x).setNext(y);
    	findPrevious(y).setNext(x);
    	if (x == head) {
    		this.head=y;
    	}
    	if (y == head) {
    		this.head=x;
    	}
    	y.setNext(x.getNext());
    	x.setNext(y.getNext());
    }
}








