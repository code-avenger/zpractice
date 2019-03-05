package Java8Example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShoppingCartExample {

	public Integer idCounter = 0;

	public static void main(String[] args) {

		ShoppingCartExample instance = new ShoppingCartExample();
		List<Item> list = instance.getList();

		Comparator<Item> byPrice = (Item o1, Item o2) -> o1.getPrice().compareTo(o2.getPrice());
		Comparator<Item> byWeight = (Item o1, Item o2) -> o1.getWeight().compareTo(o2.getWeight());

		List<BigDecimal> newList = new ArrayList<>();
		BigDecimal totalPrice = list.stream().map(item -> item.getPrice()).peek(newList::add).reduce(BigDecimal.ZERO, BigDecimal::add).setScale(2,
				RoundingMode.CEILING);

		int totalWeight = list.stream().mapToInt(o -> o.getWeight()).sum();

		// BigDecimal lowestPrice=list.stream().fi
		// Map<BigDecimal, List<Item>> lowestPriceItemsList = list.stream().collect(Collectors.groupingBy(Item::getPrice, TreeMap::new, Collectors.toList()));
		Item lowestPriceItem = list.stream().min(Comparator.comparing(Item::getPrice)).orElse(null);

		System.out.println("totalPrice : "+totalPrice);
		System.out.println("totalWeight : " + totalWeight);
		System.out.println("lowestPriceItem : " + lowestPriceItem);

	}

	public List<Item> getList() {
		List<Item> list = new ArrayList<>();

		list.add(new Item(++idCounter, "pen", new BigDecimal(11.11), 200));
		list.add(new Item(++idCounter, "pen", new BigDecimal(11.11), 200));
		list.add(new Item(++idCounter, "pen", new BigDecimal(11.11), 200));
		list.add(new Item(++idCounter, "pencil", new BigDecimal(8.88), 100));
		list.add(new Item(++idCounter, "pencil", new BigDecimal(8.88), 100));
		list.add(new Item(++idCounter, "eraser", new BigDecimal(3.33), 50));
		list.add(new Item(++idCounter, "scale", new BigDecimal(44.44), 300));
		list.add(new Item(++idCounter, "book", new BigDecimal(99.99), 500));
		list.add(new Item(++idCounter, "book", new BigDecimal(99.99), 500));

		return list;
	}
}

class Item {
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer weight;

	public Item(Integer id, String name, BigDecimal price, Integer weight) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}

}
