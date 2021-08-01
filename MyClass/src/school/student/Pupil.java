package school.student;

import school.education.Education;

public class Pupil extends Education {
	public void setData(String name, int roll, char section) {
		this.name = name;
		this.roll = roll;
		this.section = section;
	}

}
