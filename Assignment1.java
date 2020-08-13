import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("e://pokemon.csv");
		BufferedReader br = new BufferedReader(fr);
		String line="";
		ArrayList<String> pokemon = new ArrayList<String>();
		ArrayList<String> type = new ArrayList<String>();
		
		while ((line=br.readLine())!=null) {
			pokemon.add(line.split(",")[0]);
			type.add(line.split(",")[1]);
		}
		
		//System.out.println(pokemon);
		//System.out.println(type);
		
		pokemon.remove(0);
		type.remove(0);
		
		HashSet<String> uniqueType = new HashSet<String>(type);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String u : uniqueType) {
			Integer count = 0;
			for(int i=0; i<type.size(); i++) {
				if(u.equals(type.get(i))) {
					count++;
				}
			}
			hm.put(u, count);
		}
		
		// Display the count of pokemon for each type
		for(Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
