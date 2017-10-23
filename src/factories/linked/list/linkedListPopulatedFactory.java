package factories.linked.list;

import objects.linked.list.RegularLinkedList;

public class linkedListPopulatedFactory {

	public RegularLinkedList getLinkedLists(){

		RegularLinkedList linkedList = new RegularLinkedList();
		linkedList.setName("lista 1");
		RegularLinkedList linkedList2 = new RegularLinkedList();
		linkedList2.setName("lista 2");
		linkedList.setNextElement(linkedList2);
		RegularLinkedList linkedList3 = new RegularLinkedList();
		linkedList3.setName("lista 3");
		linkedList2.setNextElement(linkedList3);
		RegularLinkedList linkedList4 = new RegularLinkedList();
		linkedList4.setName("lista 4");
		linkedList3.setNextElement(linkedList4);

		return linkedList;

	}

}
