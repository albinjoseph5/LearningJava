package assignmentJune12;

public class Person {
	int hieght;
	int weight;

	boolean hieghtCheck() {
		if (hieght > 90 && hieght < 200) {
			return true;
		} else {
			return false;
		}
	}

	boolean weightCheck() {
		if (weight > 15 && weight < 95) {
			return true;
		} else {
			return false;
		}
	}
}
