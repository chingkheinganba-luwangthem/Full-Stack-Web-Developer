package HomeWork;

class Student {
    String name;
    final String enroll;
    int marks;
    private static int randomnumber = 500;
    
    public Student(String name, int marks) {
        this.name = name;
        this.enroll = "2025PU" + randomnumber++;
        this.marks = marks;
    }

    void details() {
        System.out.println("Student Name: " + name + " | Enrollment: " + enroll + " | Marks: " + marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRandomnumber() {
        return randomnumber;
    }

    public void setRandomnumber(int randomnumber) {
        this.randomnumber = randomnumber;
    }

    public String getEnroll() {
        return enroll;
    }
}
