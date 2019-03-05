package Collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class ArrayListCapacity {
	public static void main(String[] args) throws Exception {

		List<String> list = new ArrayList<String>();
		list.add("a");

		System.out.println(list.size());
		// System.out.println(list.);

		System.out.println(getCapacity(list));
	}

	static int getCapacity(List<?> l) throws Exception {
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		return ((Object[]) dataField.get(l)).length;
	}
}
