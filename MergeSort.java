import java.util.List;

public class MergeSort {
	
	public static void sort(List<Student> student) {
        mergeSort(student, 0, student.size() - 1);
    }

    private static void mergeSort(List<Student> student, int l, int r) {
        if (l < r) 
        {
            int m = (l + r) / 2;

            mergeSort(student, l, m);
            mergeSort(student, m + 1, r);
            merge(student, l, m, r);
        }
    }

    private static void merge(List<Student> student, int l, int m, int r) {
        int leftSize = m - l + 1;
        int rightSize = r - m;

        Student[] leftarr = new Student[leftSize];
        Student[] rightarr = new Student[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftarr[i] = student.get(l + i);
        }

        for (int j = 0; j < rightSize; j++) {
            rightarr[j] = student.get(m + 1 + j);
        }

        int i = 0, j = 0, k = l;

        while (i < leftSize && j < rightSize) {
            if (leftarr[i].getId() <= rightarr[j].getId()) {
            	student.set(k, leftarr[i]);
                i++;
            } else {
            	student.set(k, rightarr[j]);
                j++;
            }
            k++;
        }

        while (i < leftSize) {
        	student.set(k, leftarr[i]);
            i++;
            k++;
        }

        while (j < rightSize) {
        	student.set(k, rightarr[j]);
            j++;
            k++;
        }
    }
}






