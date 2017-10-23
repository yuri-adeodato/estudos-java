package main.linked.list;

import objects.linked.list.RegularLinkedList;
import factories.linked.list.linkedListPopulatedFactory;

public class DeleteAllElements {


	private static RegularLinkedList linkedList;

	public static void main(String[] args) {
		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();
		linkedList = factory.getLinkedLists();
		deleteAllElements(linkedList);



	}

	private static RegularLinkedList deleteAllElements(RegularLinkedList regularLinkedList) {
		if (regularLinkedList == null){
			return null;
		}

		if (regularLinkedList.getNextElement() != null){
			deleteAllElements(regularLinkedList.getNextElement());
			regularLinkedList.setNextElement(null);

		}
		return regularLinkedList;

	}



}
