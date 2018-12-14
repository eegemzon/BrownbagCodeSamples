
import java.util.Comparator;

public class SweetnessLevelComparator implements Comparator<Candy> {

	@Override
	public int compare(Candy o1, Candy o2) {
		if (o1.getSweetnessLevel() < o2.getSweetnessLevel()) {
			return -1;
		} else if (o1.getSweetnessLevel() > o2.getSweetnessLevel()) {
			return 1;
		} else {
			return 0;
		}

	}

}
