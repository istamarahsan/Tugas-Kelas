//package company.after;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap <String, Integer> workers = new HashMap<>();
		workers.put("jack anderson", 10000);
		workers.put("Keila rin", 11000);

		
		for(Map.Entry<String, Integer> worker : workers.entrySet()){
			System.out.println(worker.getKey() + "'s salary is Rp." + worker.getValue());
		}
	}
}
