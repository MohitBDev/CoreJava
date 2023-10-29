package Tester;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

import static utils.StudentCollectionUtils.*;

import com.app.core.Student;
import com.app.core.Subject;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--List--");
		List<Student> slist = populateList();
		slist.forEach(s -> System.out.println(s));
		System.out.println("--Map--");
		Map<String, Student> smap = populateMap(slist);
		smap.values().forEach(s -> System.out.println(s));
		slist.stream().sorted((s1, s2) -> ((Double) s1.getGpa()).compareTo(s2.getGpa()))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("Enter Subject for gpa :");
		String sub = sc.next().toUpperCase();
		OptionalDouble Avg1 = smap.values().stream().filter(s -> s.getSubject().equals(Subject.valueOf(sub)))
				.mapToDouble(s -> s.getGpa()).average();
		System.out.println(Avg1);
		System.out.println("Enter Subject for toperr:");
		String sub2 = sc.next().toUpperCase();
		Optional<Student> max1 = smap.values().stream().filter(s -> s.getSubject().equals(Subject.valueOf(sub2)))
				.max((d1, d2) -> ((Double) d1.getGpa()).compareTo(d2.getGpa()));

		if (max1.isPresent())
			System.out.println(max1.get().getName());
		else
			System.out.println("no subject data prestent");

		System.out.println("Enter Subject for fail:");
		String sub3 = sc.next().toUpperCase();
		slist.stream().filter(s -> s.getSubject().equals(Subject.valueOf(sub3))).filter(s -> s.getGpa() < 5)
				.forEach(s -> System.out.println(s));

		System.out.println("Enter City ");
		String city = sc.next();
		smap.values().stream().filter(s -> s.getAddress().getCity().equals(city)).forEach(s -> System.out.println(s));
		;

	}

}
