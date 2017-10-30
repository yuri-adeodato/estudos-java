package objects.linked.list;


public class RegularLinkedList implements LinkedListInterface{

	private RegularLinkedList nextElement;

	private String name;

	public RegularLinkedList getNextElement() {
		return nextElement;
	}

	public void setNextElement(RegularLinkedList nextElement) {
		this.nextElement = nextElement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
