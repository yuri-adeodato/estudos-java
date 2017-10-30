package objects.linked.list;


public class DoublyLinkedList implements LinkedListInterface {

	private DoublyLinkedList prevElement;

	private DoublyLinkedList nextElement;

	private String name;

	public DoublyLinkedList getNextElement() {
		return nextElement;
	}

	public void setNextElement(DoublyLinkedList nextElement) {
		this.nextElement = nextElement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DoublyLinkedList getPrevElement() {
		return prevElement;
	}

	public void setPrevElement(DoublyLinkedList prevElement) {
		this.prevElement = prevElement;
	}
}
