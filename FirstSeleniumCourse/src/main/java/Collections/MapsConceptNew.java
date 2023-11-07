package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsConceptNew {
	public void genericMap() {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Kiran");
		map.put(102, "Mounika");
		map.put(103, "Ramana");
		map.put(104, "vinod");
		
		for(Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	public void compareByKey_AscendingOrder() {
		HashMap<Integer,Float> map1=new HashMap<Integer,Float>();
		map1.put(1, 12.40f);
		map1.put(2, 11.32f);
		map1.put(3, 43.21f);
		map1.put(4, 33.18f);
		
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
	public void comapreByKey_descendingOrder() {
		LinkedHashMap<String,Double> hm=new LinkedHashMap<String,Double>();
		hm.put("Length", 22.34);
		hm.put("Breadth", 25.67);
		hm.put("Height", 10.45);
		hm.put("Area", 600.85);
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
	public void compareByValue_AscendingOrder() {
		TreeMap<String,String> ts=new TreeMap<String, String>();
		ts.put("Kiran", "Bangalore");
		ts.put("Mounika", "hyderabad");
		ts.put("Ramana", "Chennai");
		ts.put("Vinod", "ptg");
		
		ts.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
	public void compareByValue_DescendingOrder() {
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("Kiran", "Chennai");
		hm1.put("Mounika", "");
		hm1.put("Ramana", "Ptg");
		hm1.put("Vinod", "Hyderabad");
		
		hm1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
	public static void main(String[] args) {
		MapsConceptNew n=new MapsConceptNew();
		n.compareByKey_AscendingOrder();
		n.comapreByKey_descendingOrder();
		n.compareByValue_AscendingOrder();
		n.compareByValue_DescendingOrder();
	}
}
