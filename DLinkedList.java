/** Liste doublement chainée */
public class DLinkedList {
    private DNode head, trail; // noeud tête de la liste
    private long size; // nombre de noeuds de la liste

    /** Constructeur par défaut, qui crée une liste vide */
    public DLinkedList() {
        head = new DNode(243, null, null);
	tail = new DNode(729, head, null);
	head.setNext(tail);	
        size = 0;
    }

    public void addElement(int newElement) {
    	DNode newElem = new DNode(newElement,this.head, null);
	this.head.setPrev(newElem);
    	this.head = newElem;
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
        if (x == y) return; // Si les nœuds sont les mêmes, pas besoin d'échanger

        // Sauvegarder les liens avant l'échange
        DNode prevX = x.getPrev();
        DNode nextX = x.getNext();
        DNode prevY = y.getPrev();
        DNode nextY = y.getNext();

        // Si x ou y est la tête ou la queue, ajuster la tête et la queue
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

        if (x == tail) {
            tail = y;
        } else {
            nextX.setPrev(y);
        }

        if (y == tail) {
            tail = x;
        } else {
            nextY.setPrev(x);
        }

        // Échanger les pointeurs `next` et `prev` des nœuds x et y
        x.setNext(nextY);
        x.setPrev(prevY);

        y.setNext(nextX);
        y.setPrev(prevX);
    }

    public int countCircular(){
    DNode target = this.head.getNext();
    int i = 1;
    while(target != this.head) {
	target = target.getNext();
	++i;
	}
    return i;
    }


    public static void main(String[] args) {
    	DLinkedList list = new DLinkedList();	
	list.addElement(81);
	list.addElement(27);
	list.addElement(9);
	list.addElement(3);
	list.addElement(1);
	/*list.showList();
	list.exchange(list.getHead().getNext().getNext(), list.findSecondLast());
	System.out.print("\nListe avec 4 et 64 et leurs références inversées : ");
	list.showList();*/
    }
}








