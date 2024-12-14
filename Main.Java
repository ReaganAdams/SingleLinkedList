public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Creating a linked list with value 10:");
        list.createLinkedList(10);
        list.traverseLinkedList();

        System.out.println("\nInserting 20 at the beginning:");
        list.insertInLinkedList(20, 0);
        list.traverseLinkedList();

        System.out.println("\nInserting 30 at the end:");
        list.insertInLinkedList(30, 2);
        list.traverseLinkedList();

        System.out.println("\nInserting 25 at position 1:");
        list.insertInLinkedList(25, 1);
        list.traverseLinkedList();

        System.out.println("\nDeleting the first node:");
        list.deleteNode(0);
        list.traverseLinkedList();

        System.out.println("\nDeleting the last node:");
        list.deleteNode(2);
        list.traverseLinkedList();

        System.out.println("\nDeleting the node at position 1:");
        list.deleteNode(1);
        list.traverseLinkedList();

        System.out.println("\nTrying to delete from an empty list:");
        list.deleteNode(0);
        list.deleteNode(0);
    }
}
