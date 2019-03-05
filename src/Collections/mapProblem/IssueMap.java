package Collections.mapProblem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IssueMap {
	static int i = 0;
	public static void main(String[] args) {

		Map<BigDecimal, OrderItem> orderItemMap = new HashMap<>();
		List<OrderItem> orderItemList = new ArrayList<OrderItem>();

		OrderItem item1 = new OrderItem();
		item1.setNetValue(new BigDecimal(12));
		OrderItem item2 = new OrderItem();
		item2.setNetValue(new BigDecimal(8));
		
		orderItemList.add(item1);
		orderItemList.add(item2);



		for (OrderItem item : orderItemList) {

			orderItemMap.put(item.getNetValue(), item);
			System.out.println("size " + orderItemMap.size());

			if (orderItemMap.size() > 1) {

				orderItemMap.forEach((key, value) -> {

					System.out.println("key :" + key);
					System.out.println("item :" + item);
					System.out.println(key.compareTo(item.getNetValue()));

					if (key.compareTo(item.getNetValue()) > 0) {
						if (i != 3)
							i = i + 3;
							System.out.println("3 fields set to new pojo from iphone pojo");

					} else {
							if (i != 2)
							i = i + 2;

							System.out.println("2 fields set to new pojo from iphone pojo");
					}
				});
			}
		}
		System.out.println("total " + i + " fields set to new pojo from both the items");
	}
}
