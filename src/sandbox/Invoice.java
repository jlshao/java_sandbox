package sandbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Invoice {
	long id;
	String name;
	double amount;

	public Invoice(long id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		Map<Car, Integer> map = new HashMap<>();
		System.out.println(map);

		final Set<DaysOfTheWeek> enumSetAll = EnumSet.allOf(DaysOfTheWeek.class);
		System.out.println(enumSetAll);

		List<Invoice> invoices = new ArrayList<>();
		invoices.add(new Invoice(1, "a", 67));
		invoices.add(new Invoice(3, "vff", 4.3));
		invoices.add(new Invoice(6, "dgg", 9999));
		invoices.add(new Invoice(8, "vff", 467.3));

		Comparator<Invoice> byAmount = Comparator.comparingDouble(Invoice::getAmount);
		invoices.sort(byAmount);
		invoices.stream().forEach(System.out::println);

		List<Invoice> byName = invoices.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
				.collect(Collectors.toList());
		byName.stream().forEach(System.out::println);

		Optional<Invoice> found = invoices.stream().filter(inv -> inv.getId() == 1).findAny();
		if (found.isPresent())
			System.out.println(found.get());

		Map<String, List<Invoice>> customerToInvoices = invoices.stream()
				.collect(Collectors.groupingBy(Invoice::getName));
		System.out.println(customerToInvoices);
	}
}
