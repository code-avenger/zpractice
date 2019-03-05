package Interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(1);
		list.add(23);

		int arr[] = new int[3];
		arr[0] = 234;
		arr[1] = 2;
		arr[2] = 34;

		Arrays.sort(arr);
		Collections.sort(list);

		System.out.println(list);
		System.out.println(Arrays.toString(arr));

	}
}
