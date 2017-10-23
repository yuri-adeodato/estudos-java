package comparator.linked.list;

import java.util.Comparator;

import objects.linked.list.RegularLinkedList;

public class NameComparator implements Comparator<RegularLinkedList> {

	@Override
	public int compare(RegularLinkedList o1, RegularLinkedList o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
