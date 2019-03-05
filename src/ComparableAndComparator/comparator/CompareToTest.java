package ComparableAndComparator.comparator;

import java.util.Comparator;

public class CompareToTest implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
