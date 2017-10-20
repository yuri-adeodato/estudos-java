package facade.linked.list;

import objects.linked.list.RegularLinkedList;

public class LinkedListFacadeImpl implements LinkedListFacade {

	@Override
	public void showElements(RegularLinkedList populatedList) {
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

}
