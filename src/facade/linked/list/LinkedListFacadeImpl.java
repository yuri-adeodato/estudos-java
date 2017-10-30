package facade.linked.list;

import objects.linked.list.DoublyLinkedList;
import objects.linked.list.LinkedListInterface;
import objects.linked.list.RegularLinkedList;

public class LinkedListFacadeImpl implements LinkedListFacade {

	@Override
	public void showElements(LinkedListInterface populatedList) {
		LinkedListInterface element = populatedList;

		while (true) {
			System.out.println(element.getName());
			element = element.getNextElement();
			if (element.getNextElement() == null){
				System.out.println(element.getName());
				break;
			}
		}
	}

	@Override
	public Integer getNumberElements(LinkedListInterface linkedList) {

		if (linkedList == null){
			return 0;
		}

		return countElements(linkedList, 1);
	}

	private  Integer countElements(LinkedListInterface linkedList,Integer count) {

		if(linkedList.getNextElement() != null){
			return countElements(linkedList.getNextElement(), ++count);
		} else {
			return count;
		}

	}


	@Override
	public void appendElementInEnd(RegularLinkedList linkedList,RegularLinkedList populatedList) {

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

	@Override
	public void appendElementInEnd(DoublyLinkedList linkedList,DoublyLinkedList populatedList) {

		if (linkedList == null || populatedList == null){
			return;
		}

		if (populatedList.getNextElement() == null ){
			populatedList.setNextElement(linkedList);
			linkedList.setPrevElement(populatedList);
			return;
		}

		DoublyLinkedList element = populatedList;
		while (true) {
			element = element.getNextElement();
			if (element.getNextElement() == null){
				element.setNextElement(linkedList);
				linkedList.setPrevElement(element);
				break;
			}
		}

	}


}
