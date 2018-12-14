import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
		List<Candy> listOfCandy = new ArrayList<Candy>();
		
		Candy mentos = new Candy("Mentos", "white", 1);
		Candy dynamite = new Candy("Dynamite", "orange", 3);
		Candy halls = new Candy("Halls", "green", 4);
		Candy max = new Candy("Max", "yellow", 2);
		Candy star = new Candy("Star", "red", 5);
		
		listOfCandy.add(mentos);
		listOfCandy.add(dynamite);
		listOfCandy.add(halls);
		listOfCandy.add(max);
		listOfCandy.add(star);
		
		System.out.println("\nBy Comparable");
		Collections.sort(listOfCandy);
		print(listOfCandy);
		
		ColorComparator colorComp = new ColorComparator();
		SweetnessLevelComparator sweetnessLevelComp = new SweetnessLevelComparator();
		
		System.out.println("\nBy Color:");
		Collections.sort(listOfCandy, colorComp);
		print(listOfCandy);
		
		System.out.println("\nBy Sweetness Level:");
		Collections.sort(listOfCandy, sweetnessLevelComp);
		print(listOfCandy);
		
	}
	
	public static void print(List<Candy> list){
		for(Candy candy : list){
			System.out.println("Candy: " + candy.getName() + " Color: " + candy.getColor() 
								+ " Sweetness level: " + candy.getSweetnessLevel());
		}
	}
}
