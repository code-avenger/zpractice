package Collections.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapSort {
	public static void main(String a[]){

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("python", 2);
		map.put("unix", 67);
		map.put("mac", 26);


		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);

		// Sort prior to java 8
		/*Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
				{
			public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
			{
				return (o2.getValue()).compareTo( o1.getValue() );
			}
				} );*/

        set.stream().filter(x -> x.getValue() > 40).collect(Collectors.toList()).forEach(x -> {
            System.out.println(x);
        });

		//Sort using java 8
        Collections.sort(list, (x, y) -> x.getValue().compareTo(y.getValue()));

		for(Map.Entry<String, Integer> entry:list){
			System.out.println(entry.getKey()+" ==== "+entry.getValue());
		}
	}
}
