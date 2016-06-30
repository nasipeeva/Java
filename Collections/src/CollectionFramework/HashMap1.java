package CollectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The keys in HashMap are not sorter!!!
				// In TreeMap keys are sorted!!!
				// That is the difference between them!!!

				HashMap<String, Float> map = new HashMap<String, Float>();

				map.put("Pepi", 6f);
				map.put("Emi", 5f);
				map.put("Niki", 1f);

				Float toniMarks = map.get("Emi");
				System.out.printf("Emi's mark: %.2f %n", toniMarks);

				map.remove("Niki");
				System.out.println("Niki removed!");

				System.out.printf("Is Niki in the hash table: %b %n",
						map.containsKey("Niki"));

				map.put("Emi", 6f);
				System.out.println("Tony's mark changed to excellent!");

				System.out.println("Stydents marks and names: ");
				for (Entry<String, Float> entry : map.entrySet()) {
					System.out
							.printf("%s has %.2f%n", entry.getKey(), entry.getValue());

				}

	}

}
