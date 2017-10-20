package main.linked.list;

import objects.linked.list.RegularLinkedList;
import factories.linked.list.linkedListPopulatedFactory;

public class CountElements {

	public static void main(String[] args) {

		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();

		Integer numberElements = getNumberElements(factory.getLinkedLists());

		System.out.println("have "+numberElements+"");


	}

	private static Integer getNumberElements(RegularLinkedList linkedList) {

		if (linkedList == null){
			return 0;
		}

		return countElements(linkedList, 1);
	}

	private static Integer countElements(RegularLinkedList linkedList,Integer count) {

		if(linkedList.getNextElement() != null){
			return countElements(linkedList.getNextElement(), ++count);
		} else {
			return count;
		}

	}

}
