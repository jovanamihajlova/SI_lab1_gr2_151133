class Faculty{

    String facultyName;
    List<Student> students;

    public Faculty(String facultyName, List<Student> students) {
        this.facultyName = facultyName;
        this.students = students;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudent(Student s){
        students.remove(s);
    }

    public void avgGrade(){
        for(Student s : students){
            System.out.println(s.getIndex() + " " + s.getAverage());
        }
    }

}