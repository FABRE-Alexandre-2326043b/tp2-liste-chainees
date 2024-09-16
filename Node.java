package tp2;

public class Node {
    private int element;
    private Node next;

    /** Crée un noeud avec l'élément et le noeud suivant donnés */
    public Node(int s, Node n) {
        element = s;
        next = n;
    }

    /** Retourne l'élément de ce noeud */
    public int getElement() {
        return element;
    }

    /** Retourne le noeud suivant de ce noeud */
    public Node getNext() {
        return next;
    }

    /** Modifie l'élément de ce noeud */
    public void setElement(int newElem) {
        element = newElem;
    }

    /** Modifie le noeud suivant de ce noeud */
    public void setNext(Node newNext) {
        next = newNext;
    }
    public void showElement() {
    	if (next==null) {
    		System.out.println(element);
    		//System.out.print(this);
    	}else {
 	   		System.out.println(Integer.toString(element) + " next " + Integer.toString(next.getElement()));
    		//System.out.print(this);
    		//System.out.print(" next ");
    		//System.out.println(this.next);
    	}
    }    
}
