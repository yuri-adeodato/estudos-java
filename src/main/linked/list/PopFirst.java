package main.linked.list;

import objects.linked.list.RegularLinkedList;
import factories.linked.list.linkedListPopulatedFactory;

public class PopFirst {


	private static RegularLinkedList linkedList;

	public static void main(String[] args) {
		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();
		linkedList = factory.getLinkedLists();
		RegularLinkedList poped = popFirst(linkedList);

		System.out.println(poped.getName());
		System.out.println(poped.getNextElement() == null);
		System.out.println(linkedList.getName());
	}

	private static RegularLinkedList popFirst(RegularLinkedList linkedLists) {

		if(linkedList == null){
			return null;
		}

		if(linkedList.getNextElement() ==null){
			return linkedList;
		}

		RegularLinkedList newLinkedList = linkedList.getNextElement();
		RegularLinkedList poped = linkedList;
		poped.setNextElement(null);

		linkedList = newLinkedList;
		return poped;
	}

}
