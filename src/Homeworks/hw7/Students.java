package Homeworks.hw7;

public class Students {
    public int id;
    public String name;
    public String surname;
    public String faculty;
    public int course;
    public String group;
    public int averageMark;


    public Students(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group =group;
        this.averageMark = averageMark;
    }
    public Students(){
    }

    public void info(){
        System.out.println("\nID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Surname: "+ surname);
        System.out.println("Faculty: "+ faculty);
        System.out.println("Course: "+ course);
        System.out.println("Group: "+ group);
        System.out.println("Average Mark: "+ averageMark);
    }
    public void changeGroup (String newGroup){
        group = newGroup;
        System.out.println("Новая группа: "+ newGroup);
    }
    public String getGroup(){
        return group;
    }

    public void changeMarkAndGroup (int newMark, String newGroup){
       averageMark = newMark;
       group = newGroup;
        System.out.print("Mark changed to: " + newMark + "\nGroup changed to: "+ newGroup +"\n");
    }

    public Students[] getStudents(Students[] studentsArray, int mark) {
        int count = 0;
        for (Students studentWithHigherMark : studentsArray) {
            if (studentWithHigherMark.averageMark > mark) {
                count++;
            }
        }

        Students[] result = new Students[count];
        int index = 0;
        for (Students studentWithHigherMark : studentsArray) {
            if (studentWithHigherMark.averageMark > mark) {
                result[index] = studentWithHigherMark;
                index++;
            }
        }
        return result;
    }








}



