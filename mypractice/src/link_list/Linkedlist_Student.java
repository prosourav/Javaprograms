package link_list;
import java.util.LinkedList;
public class Linkedlist_Student {
 public static void main(String args[]) {
	 LinkedList<Student> name = new LinkedList<Student>();
	 Student s1 = new Student(10,"Sourav");
	 Student s2 = new Student(11,"Sayan");
	 Student s3 = new Student(12,"Soham");
	 Student s4 = new Student(13,"Sayak");
	 Student s5 = new Student(14,"Shibham");
	 
	 name.add(s1);
	 name.add(s2);
	 name.add(s3);
	 name.add(s4);
	 name.add(s5);

	 for(Student x : name) {
		 System.out.println("Id: "+x.id+" Name: "+x.Name+" Class: "+x.Name );
	 }
 }
}
