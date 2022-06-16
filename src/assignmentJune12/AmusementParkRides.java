package assignmentJune12;

public class AmusementParkRides {

	boolean hieghtCheck(int hieght) {
		if (hieght > 90 && hieght < 200) {
			return true;
		}
		return false;
	}

	boolean weightCheck(int weight) {
		if (weight > 15 && weight < 95) {
			return true;
		}
		return false;
	}

}
