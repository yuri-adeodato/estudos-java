package factories.linked.list;

import objects.linked.list.DoublyLinkedList;
import objects.linked.list.RegularLinkedList;
import facade.linked.list.LinkedListFacade;
import facade.linked.list.LinkedListFacadeImpl;

public class linkedListPopulatedFactory {

	private LinkedListFacade linkedListFacade = new LinkedListFacadeImpl();

	public RegularLinkedList getLinkedLists(){

		RegularLinkedList principalList = new RegularLinkedList();
		principalList.setName("lista 1");
		RegularLinkedList linkedList2 = new RegularLinkedList();
		linkedList2.setName("lista 2");
		linkedListFacade.appendElementInEnd(linkedList2, principalList);
		RegularLinkedList linkedList3 = new RegularLinkedList();
		linkedList3.setName("lista 3");
		linkedListFacade.appendElementInEnd(linkedList3, principalList);
		RegularLinkedList linkedList4 = new RegularLinkedList();
		linkedList4.setName("lista 4");
		linkedListFacade.appendElementInEnd(linkedList4, principalList);

		return principalList;

	}

	public DoublyLinkedList getDoublyLinkedLists(){

		DoublyLinkedList principalList = new DoublyLinkedList();
		principalList.setName("lista 1");
		DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
		doublyLinkedList2.setName("lista 2");
		linkedListFacade.appendElementInEnd(doublyLinkedList2, principalList);
		DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
		doublyLinkedList3.setName("lista 3");
		linkedListFacade.appendElementInEnd(doublyLinkedList3, principalList);
		DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
		doublyLinkedList4.setName("lista 4");
		linkedListFacade.appendElementInEnd(doublyLinkedList4, principalList);

		return principalList;

	}

}
