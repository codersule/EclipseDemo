
public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course();
		course1.id=1235979;
		course1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR";
		course1.instructor="Engin Demiro�";
		
		Course course2=new Course();
		course2.id=1332369;
		course2.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT";
		course2.instructor="Engin Demiro�";
		
		Course course3=new Course();
		course3.id=3;
		course3.name="Programlamaya Giri� ��in Temel Kurs";
		course3.instructor="Engin Demiro�";
		
		
		
		
			
			Course[]courses= {course1,course2,course3};
					
	for(Course course: courses)
	{
		System.out.println(course.name);
	}

}
}