package main.linked.list;

import objects.linked.list.RegularLinkedList;
import facade.linked.list.LinkedListFacade;
import facade.linked.list.LinkedListFacadeImpl;

public class SortedInsert {

	public static void main(String[] args) {
		LinkedListFacade linkedListFacade = new LinkedListFacadeImpl();




		RegularLinkedList linkedList1 = new RegularLinkedList();
		linkedList1.setName("lista 1");

		RegularLinkedList linkedList2 = new RegularLinkedList();
		linkedList2.setName("lista 2");


		RegularLinkedList linkedList3 = new RegularLinkedList();
		linkedList3.setName("lista 3");


		RegularLinkedList linkedList4 = new RegularLinkedList();
		linkedList4.setName("lista 4");



		System.out.println("test 1");
		linkedList1 = appendElementInSortMode(linkedList3, linkedList1);
		linkedListFacade.showElements(linkedList1);

		System.out.println("test 2");
		linkedList1 = appendElementInSortMode(linkedList1, linkedList2);
		linkedListFacade.showElements(linkedList1);

		System.out.println("test 3");
		linkedList1 = appendElementInSortMode(linkedList1, linkedList4);
		linkedListFacade.showElements(linkedList1);
		//
		//		RegularLinkedList linkedList = new RegularLinkedList();
		//		linkedList.setName("Lista nova");
		//
		//		System.out.println("After");
		//		linkedListFacade.showElements(appendElementInNthPosition(populatedList, linkedList, 15));

	}

	private static RegularLinkedList appendElementInSortMode(RegularLinkedList regularLinkedList
			, RegularLinkedList newElement){


		if (regularLinkedList == null && newElement == null){
			return null;
		}

		if (regularLinkedList == null && newElement != null){
			return newElement;
		}

		if (newElement == null){
			return regularLinkedList;
		}

		//		regularLinkedList.getName().compareTo(anotherString)

		RegularLinkedList element = regularLinkedList;
		RegularLinkedList elementBefore = null;

		if(element.getName().compareTo(newElement.getName()) >0 && element.getNextElement() == null){
			newElement.setNextElement(element);
			return newElement;
		} else if(element.getNextElement() == null){
			element.setNextElement(newElement);
			return element;
		} else{


			while (element != null && element.getName().compareTo(newElement.getName())  <0) {
				elementBefore = element;
				element = element.getNextElement();
			}


			elementBefore.setNextElement(newElement);
			newElement.setNextElement(element);
		}

		//
		//
		//		RegularLinkedList elementBefore = element;
		//
		//
		//		while(true){
		//
		//			element = element.getNextElement();
		//
		//			if(element.getName().compareTo(newElement.getName()) >0){
		//				newElement.setNextElement(element);
		//				return newElement;
		//			} else if(element.getNextElement() == null){
		//				element.setNextElement(newElement);
		//				return element;
		//			}
		//
		//
		//			if(element.getNextElement() == null){
		//
		//
		//				break;
		//			}
		//
		//
		//
		//		}





		return elementBefore;



	}


}
