package main.linked.list;

import facade.linked.list.LinkedListFacade;
import facade.linked.list.LinkedListFacadeImpl;
import factories.linked.list.linkedListPopulatedFactory;

public class CountElements {

	public static void main(String[] args) {

		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();

		LinkedListFacade linkedListFacade = new LinkedListFacadeImpl();

		Integer numberElements = linkedListFacade.getNumberElements(factory.getLinkedLists());

		System.out.println("have "+numberElements+"");


	}

}
