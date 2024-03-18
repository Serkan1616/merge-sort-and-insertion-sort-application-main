import java.util.List;

public class InsertionSort {
	 
	public static void sort(List<Student> students) {
	        for (int i = 1; i < students.size(); i++) {
	            Student key = students.get(i);
	            int j = i - 1;
	            while (j >= 0 && students.get(j).getId() > key.getId()) {
	                students.set(j + 1, students.get(j));
	                j = j - 1;
	            }
	            students.set(j + 1, key);
	        }
	    }
}
