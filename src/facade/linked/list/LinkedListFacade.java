package facade.linked.list;

import objects.linked.list.DoublyLinkedList;
import objects.linked.list.LinkedListInterface;
import objects.linked.list.RegularLinkedList;

public interface LinkedListFacade {

	void showElements(LinkedListInterface populatedList);

	Integer getNumberElements(LinkedListInterface linkedList);

	void appendElementInEnd(RegularLinkedList linkedList,RegularLinkedList populatedList);

	void appendElementInEnd(DoublyLinkedList linkedList,DoublyLinkedList populatedList);

}
