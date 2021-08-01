package school.general;

import school.student.Pupil;

public class Information {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.setData("Dipti", 34, 'A');
		pupil.getData();
	}

}
