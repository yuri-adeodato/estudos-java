package main.linked.list;

import objects.linked.list.DoublyLinkedList;
import facade.linked.list.LinkedListFacade;
import facade.linked.list.LinkedListFacadeImpl;
import factories.linked.list.linkedListPopulatedFactory;

public class FrontBackSplit {


	private static LinkedListFacade linkedListFacade = new LinkedListFacadeImpl();;

	public static void main(String[] args) {

		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();

		DoublyLinkedList list = factory.getDoublyLinkedLists();


		DoublyLinkedList linkedList5 = new DoublyLinkedList();
		linkedList5.setName("lista 5");
		linkedListFacade.appendElementInEnd(linkedList5,list);

		DoublyLinkedList frontRef = new DoublyLinkedList();
		DoublyLinkedList backRef = new DoublyLinkedList();

		splitList(list, frontRef, backRef);

		System.out.println("front");
		//		linkedListFacade.showElements(frontRef);

		System.out.println("back");
		linkedListFacade.showElements(backRef);


	}

	private static void splitList(DoublyLinkedList list, DoublyLinkedList frontRef, DoublyLinkedList backRef) {

		if (list == null){
			return;
		}

		if (frontRef == null){
			frontRef = new DoublyLinkedList();
		}

		if (backRef == null){
			backRef = new DoublyLinkedList();
		}

		Integer numberElements = linkedListFacade.getNumberElements(list);

		int rest = numberElements%2;

		int half = (numberElements-rest)/2;

		DoublyLinkedList firstHalf = new DoublyLinkedList();
		DoublyLinkedList secHalf = new DoublyLinkedList();


		DoublyLinkedList element = list;
		int index = 0;
		while (true){

			if (half+1 == index){
				secHalf = element;
				element.setPrevElement(null);
				frontRef = list;
				break;
			}

			index++;
			element = element.getNextElement();
		}

		backRef = secHalf;


	}

}
