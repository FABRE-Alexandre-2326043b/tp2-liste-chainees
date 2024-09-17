/** Liste doublement chainée */
public class DLinkedList {
    private DNode head, trail; // noeud tête de la liste
    private long size; // nombre de noeuds de la liste

    /** Constructeur par défaut, qui crée une liste vide */
    public DLinkedList() {
        head = new DNode(243, null, null);
	trail = new DNode(729, head, null);
        size = 0;
    }

    public void addElement(int newElement) {
    	DNode newElem = new DNode(newElement,this.head, null);
    	this.head = newElem;
	this.head.setPrev(newElem);
    	size+=1;
    }
    
    public DNode findPrevious(DNode x) {
	DNode target = this.head;
	// Traverse until the DNode before x is found
	if (target == null || target == x) return null;
	while(target.getNext() != x) {
	    target = target.getNext();
	}
	return target;
    }

    
    public DNode findSecondLast() {
    	DNode target = this.head;
    	while(target.getNext().getNext() != null) {
    		target = target.getNext();
    	}
    	return target;
    }
    
    public void showList() {
    DNode target = this.head;
    	while(target != null) {
    		target.showElement();
		target = target.getNext();
    	}  	
    }
    
    public void exchange(DNode x, DNode y) {
    if (x == y) return; // No need to swap if the DNodes are the same

    // Find previous DNodes of x and y
    DNode prevX = findPrevious(x);
    DNode prevY = findPrevious(y);
    
    // Handle cases where x or y is head
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

    // Swap their next pointers
    DNode temp = x.getNext();
    x.setNext(y.getNext());
    y.setNext(temp);
    }


    public static void main(String[] args) {
    	DLinkedList list = new DLinkedList();	
	list.addElement(81);
	list.addElement(27);
	list.addElement(9);
	list.addElement(3);
	list.addElement(1);
	list.showList();
	/*list.exchange(list.getHead().getNext().getNext(), list.findSecondLast());
	System.out.print("\nListe avec 4 et 64 et leurs références inversées : ");
	list.showList();*/
    }
}








