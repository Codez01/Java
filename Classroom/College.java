import java.util.ArrayList;

public class College {

	private ArrayList<Course> courses;

	public College() {
		courses = new ArrayList<>();

	}

	public void setClassForCourse(String courseName, Classroom room) throws NotAssignedException {

		boolean isFound = false;

		for (int j = 0; j < courses.size(); j++) {
			if (courses.get(j).getCourseName().equals(courseName)) {

				isFound = true;
			}

		}
		if (!isFound) {
			throw new NotAssignedException();

		}

		try {
			for (int i = 0; i < courses.size(); i++) {
				if (courses.get(i).getCourseName().equals(courseName)) {
					courses.get(i).setClassRoom(room);
				}
			}

		} catch (Exception InvalidClassroomException) {
			throw new NotAssignedException();

		}
	}
}
