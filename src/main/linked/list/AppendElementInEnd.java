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

		appendElementInEnd(linkedList,populatedList);

		System.out.println("After");
		linkedListFacade.showElements(populatedList);

	}

	private static void showResults(RegularLinkedList populatedList) {
		RegularLinkedList element = populatedList;

		while (true) {
			System.out.println(element.getName());
			element = element.getNextElement();
			if (element.getNextElement() == null){
				System.out.println(element.getName());
				break;
			}
		}
	}

	private static void appendElementInEnd(RegularLinkedList linkedList,RegularLinkedList populatedList) {

		if (linkedList == null || populatedList == null){
			return;
		}

		if (populatedList.getNextElement() == null){
			populatedList.setNextElement(linkedList);
			return;
		}

		RegularLinkedList element = populatedList;

		while (true) {
			element = element.getNextElement();
			if (element.getNextElement() == null){
				element.setNextElement(linkedList);
				break;
			}
		}
	}

}
