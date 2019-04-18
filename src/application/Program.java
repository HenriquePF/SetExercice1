package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		// Hashset é extremamente rápido mas não garante a ordem dos elementos
	//	Set<String> set = new HashSet<>();

		// TreeSet ordena os dados, ou seja, no caso está de forma alfabética
	//	Set<String> set = new TreeSet<>();

		// LinkedHashSet mantém a ordem dos elementos conforme adicionados
		Set<String> set = new LinkedHashSet<>();

		
		
		set.add("Smartphone");
		set.add("Ebook");
		set.add("Desktop");

	//	set.remove("Tablet");
	//	set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(1) == 'a');
		
	//	System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}

}
