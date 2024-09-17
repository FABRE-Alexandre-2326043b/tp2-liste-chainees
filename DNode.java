public class DNode {
    private int element;
    private DNode next, prev;

    /** Crée un noeud avec l'élément, le noeud suivant et le noeud précédent donnés */
    public DNode(int s, DNode n, DNode p) {
        element = s;
        next = n;
	prev = p;	
    }

    /** Retourne l'élément de ce noeud */
    public int getElement() {
        return element;
    }

    /** Retourne le noeud suivant de ce noeud */
    public DNode getNext() {
        return next;
    }

    /** Retourne le noeud précédent de ce noeud */
    public DNode getPrev() {
        return prev;
    }

    /** Modifie le noeud suivant de ce noeud */
    public void setNext(DNode newNext) {
        next = newNext;
    }
    
    /** Modifie le noeud précédent de ce noeud */
    public void setPrev(DNode newPrev) {
        prev = newPrev;
    }

public void showElement() {
        if (prev == null && next != null) {
            System.out.println(Integer.toString(element) + " next " + Integer.toString(next.getElement()));
        } 
        else if (next == null && prev != null) {
            System.out.println(Integer.toString(prev.getElement()) + " prev " + Integer.toString(element));
        } 
        else if (prev != null && next != null) {
            System.out.println(Integer.toString(prev.getElement()) + " prev " + Integer.toString(element) + " next " + Integer.toString(next.getElement()));
        }
        else {
            System.out.println(Integer.toString(element));
        }
    }

    public static void main(String[] args) {
    
    }
}
