import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		ReadingOp reader = new ReadingOp();
        List<Student> students = reader.readStudents("student.txt");
        InsertionSort.sort(students);
        
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        
        ReadingOp reader2 = new ReadingOp();
        List<Student> students2 = reader.readStudents("student.txt");
        MergeSort.sort(students2);
        
        for (int i = 0; i < students2.size(); i++) {
            Student student2 = students2.get(i);
            System.out.println(student2);
        }
         
	}
}

class Student {
	
	private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	public String toString() {
        return name + " " + surname + " " + id;
    }

}