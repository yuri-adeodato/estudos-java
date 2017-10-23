package main.linked.list;

import objects.linked.list.RegularLinkedList;
import factories.linked.list.linkedListPopulatedFactory;

public class GetElementInPositionX {

	public static void main(String[] args) {
		linkedListPopulatedFactory factory = new linkedListPopulatedFactory();
		showResults(getElementInPosition(factory.getLinkedLists(),2));
		showResults(getElementInPosition(factory.getLinkedLists(),0));
		showResults(getElementInPosition(factory.getLinkedLists(),3));
		showResults(getElementInPosition(factory.getLinkedLists(),4));
		//

	}

	private static void showResults(RegularLinkedList linkedList) {
		if(linkedList != null){
			System.out.println(linkedList.getName());
		} else{
			System.out.println("Elemento Invalido");
		}
	}

	private static RegularLinkedList getElementInPosition(RegularLinkedList linkedLists,int position) {
		if (linkedLists == null || position < 0){
			return null;
		}

		if(linkedLists.getNextElement() == null){
			return linkedLists;
		}

		return getElement(linkedLists,0,position);
	}

	private static RegularLinkedList getElement(RegularLinkedList linkedList,int initialPosition, int finalPosition) {
		if (initialPosition == finalPosition){
			return linkedList;
		} else if(linkedList.getNextElement() != null){
			return getElement(linkedList.getNextElement(), ++initialPosition, finalPosition);
		} else{
			return null;
		}
	}

}
