package CollectionFramework;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			HashSet<String> javaStudents = new HashSet<>();
			javaStudents.add("Stefan Vadev");
			javaStudents.add("Evgeni Dimitrov");
			javaStudents.add("Vladislav Borisov");
			javaStudents.add("Peter Manolov");

			HashSet<String> PHPstudents = new HashSet<>();
			PHPstudents.add("Peter Manolov");
			PHPstudents.add("Niki Telerika");
			PHPstudents.add("Svetlin Nakov bota");

			System.out.println("Java students: " + javaStudents);
			System.out.println("PHP students: " + PHPstudents);

			// INTERSECTION = pokazva obshtata chast !!!
			// pravim si nov set i kopirame pyrviq v nego!!!
			HashSet<String> intersect = new HashSet<>(javaStudents);

			// intersect.zapazi vsi4ki koeto sa v intersekta(javaStidents) i
			// PHPstudents
			intersect.retainAll(PHPstudents);

			System.out.println("Java AND PHP students: " + intersect);

			// DIFFERENCE

			HashSet<String> difference = new HashSet<>(javaStudents);

			// premahni vsi4ki obshti! ot javaStudents premahni vsiki koito gi ima
			// i v PHPStudents
			difference.removeAll(PHPstudents);

			System.out.println("DIFFERENCE: " + difference);


	}

}
