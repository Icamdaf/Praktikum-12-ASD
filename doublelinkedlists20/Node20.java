
import org.w3c.dom.Node;

public class Node20 {
    int  data;
    Node08 prev, next;

    Node20(Node20 prev, int data, Node20 next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}