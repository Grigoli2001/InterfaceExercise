package listInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
		
		public void ListExample() {
			List<String> list = new ArrayList<String>();
			list.add("cat");
			list.add("rat");
			list.add("bat");
			
			list.set(1, "mat");
			System.out.println("Array List:");

			for(String st:list) {
				System.out.println(st);
			}
		}
}