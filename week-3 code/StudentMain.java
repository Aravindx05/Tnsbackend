
public class StudentMain {

	public static void main(String[] args) {
		Student ob = new Student();
		ob.rollno = 1001;
		ob.sname = "kalyan";
		ob.sbranch = "CSE-A";
		ob.print();
		
		Student obj = new Student();
		obj.rollno = 1002;
		obj.sname = "vithesh";
		obj.sbranch = "CSE-B";
		obj.print();
		
		Student op = new Student();
		op.rollno = 1003;
		op.sname = "Gunu";
		op.sbranch = "CSE-C";
		op.print();
	}

}
