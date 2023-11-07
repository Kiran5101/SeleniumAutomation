package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsConcept {
	public void HashMap_Method() {
		Map<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(0, "");
		hm.put(2, "Radhika");
		hm.put(3,"P Ramana Reddy");
		hm.put(4, "Lakshmi");
		
		Map<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(5, "Kussu");
		hm1.put(6, "Kiran Kumar Reddy");
		hm1.put(7, "Vinod Kumar");
		
		hm.putAll(hm1);
		/*
		 * Set set=hm.entrySet(); Iterator itr=set.iterator(); while(itr.hasNext()) {
		 * Map.Entry entry=(Map.Entry)itr.next();
		 System.out.println(entry.getKey()+"     "+entry.getValue());
		}*/
		
		
		 for(Map.Entry m:hm.entrySet()) { System.out.println(m.getKey()+" : "+
		 m.getValue()); }
		 
		//comapringby Key in ascending order

		
	}
	
	public static void main(String[] args) {
		MapsConcept mc=new MapsConcept();
		mc.HashMap_Method();
	}

}
