package main.linked.list;

import objects.linked.list.RegularLinkedList;
import facade.linked.list.LinkedListFacade;
import facade.linked.list.LinkedListFacadeImpl;
import factories.linked.list.linkedListPopulatedFactory;

public class InsertInNthPosition {

	public static void main(String[] args) {
		LinkedListFacade linkedListFacade = new LinkedListFacadeImpl();

		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();

		RegularLinkedList populatedList =  factory.getLinkedLists();

		System.out.println("Before");
		linkedListFacade.showElements(populatedList);

		RegularLinkedList linkedList = new RegularLinkedList();
		linkedList.setName("Lista nova");

		System.out.println("After");
		linkedListFacade.showElements(appendElementInNthPosition(populatedList, linkedList, 15));

	}

	private static RegularLinkedList appendElementInNthPosition(RegularLinkedList populatedList, RegularLinkedList newElement, Integer position){

		if (populatedList == null){
			System.out.println("A lista esta nula");
		}

		RegularLinkedList element = populatedList;
		Integer index = 1;

		if (position == index){
			newElement.setNextElement(element);
			return newElement;

		}

		while (true) {

			element = element.getNextElement();
			index++;

			if (position == index){

				RegularLinkedList beforeElement = element;
				RegularLinkedList afterElement = element.getNextElement();
				newElement.setNextElement(afterElement);

				element.setNextElement(newElement);
				break;



			}



			if (element.getNextElement() == null){

				if (position == index+1){
					RegularLinkedList beforeElement = element;
					RegularLinkedList afterElement = element.getNextElement();
					newElement.setNextElement(afterElement);

					element.setNextElement(newElement);

				}

				if (position > index+1){
					System.out.println("A lista não tem tantos elementos");
				}

				break;
			}

		}
		return populatedList;



	}


}
