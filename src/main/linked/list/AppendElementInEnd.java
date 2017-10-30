package main.linked.list;

import objects.linked.list.RegularLinkedList;
import facade.linked.list.LinkedListFacade;
import facade.linked.list.LinkedListFacadeImpl;
import factories.linked.list.linkedListPopulatedFactory;

public class AppendElementInEnd {

	public static void main(String[] args) {
		LinkedListFacade linkedListFacade = new LinkedListFacadeImpl();

		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();

		RegularLinkedList populatedList =  factory.getLinkedLists();

		RegularLinkedList linkedList = new RegularLinkedList();
		linkedList.setName("Lista nova");

		System.out.println("Before");
		linkedListFacade.showElements(populatedList);

		linkedListFacade.appendElementInEnd(linkedList,populatedList);

		System.out.println("After");
		linkedListFacade.showElements(populatedList);

	}

}
