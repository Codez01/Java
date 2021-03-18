
public class Course implements Comparable<Course> {

	private String courseName; // course name

	private int dayOfWeek;// the day that course will take a place in. , Sunday (1) , Monday (2)....
	// **every course can take a place only once per week**

	private int startHour; // the course starting time

	private int numOfStudents; // the number of the students are going to take a part in that course

	private Classroom courseClassRoom; // the class that the course will take a place at

	public Course(String courseName, int dayOfWeek, int startHour, int numOfStudents) {

		this.courseName = courseName;
		this.dayOfWeek = dayOfWeek;
		this.startHour = startHour;
		this.numOfStudents = numOfStudents;
		this.courseClassRoom = null;

		if (this.dayOfWeek <= 0 || this.dayOfWeek > 7) {
			this.dayOfWeek = -1;
		} else if (this.startHour > 24 || this.startHour < 1) {
			this.startHour = -1;
		} else if (this.numOfStudents < 5) {
			this.numOfStudents = -1;
		}

	}

	public String getCourseName() {
		return courseName;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public int getStartHour() {
		return startHour;
	}

	public int getNumOfStudents() {
		return numOfStudents;
	}

	public Classroom getCourseClassRoom() {
		return courseClassRoom;
	}

	public int compareTo(Course other) {
		if (this.getDayOfWeek() > other.getDayOfWeek()) {
		
			return 1;
		} else if (this.getDayOfWeek() < other.getDayOfWeek()) {
			return -1;
		} else {

			if (this.getStartHour() > other.getStartHour()) {
				return 1;
			}
			if (this.getStartHour() < other.getStartHour()) {
				return -1;
			}
			return 0;

		}
	}

	public void setClassRoom(Classroom ClassRoom) throws InvalidClassroomException {

		if (this.courseClassRoom.getCapacity() >= this.getNumOfStudents() && this.courseClassRoom.isUseable() == true) {
			this.courseClassRoom = ClassRoom;

		}

		throw new InvalidClassroomException();
	}
	
	
	
}
