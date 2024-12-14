package LinkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked list
    public Node createLinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // Insert into a linked list
    public void insertInLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (head == null) { // If the list doesn't exist, create it
            createLinkedList(nodeValue);
            return;
        }

        if (location == 0) { // Insert at the beginning
            newNode.next = head;
            head = newNode;
        } else if (location >= size) { // Insert at the end
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;
        } else { // Insert at a specific location
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    // Traverse a linked list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.value);
                if (tempNode.next != null) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            int index = 0;
            while (tempNode != null) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + nodeValue + " at location: " + index);
                    return true;
                }
                tempNode = tempNode.next;
                index++;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Delete a node from the linked list
    public void deleteNode(int location) {
        if (head == null) { // If the list doesn't exist
            System.out.println("The linked list does not exist");
            return;
        }

        if (location == 0) { // Delete the first node
            head = head.next;
            size--;
            if (size == 0) { // If the list is now empty
                tail = null;
            }
        } else if (location >= size - 1) { // Delete the last node
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) { // Traverse to the second-to-last node
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // If there's only one node left
                head = null;
                tail = null;
            } else {
                tempNode.next = null;
                tail = tempNode;
            }
            size--;
        } else { // Delete a node in the middle
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) { // Traverse to the node before the target
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // Skip the target node
            size--;
        }
    }
}
