import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingOp {
	
	public List<Student> readStudents(String filename) throws NumberFormatException, IOException {
		File file = new File(filename);
        List<Student> students = new ArrayList<>();
       
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] infos = line.split(",");
                String name = infos[0];
                String surname = infos[1];
                int id = Integer.parseInt(infos[2]);
                students.add(new Student(name, surname, id));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

}

