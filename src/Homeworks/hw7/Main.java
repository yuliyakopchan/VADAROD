package Homeworks.hw7;

public class Main {
    public static void main(String[] args) {


        Students[] studentsArray = new Students[5];

        studentsArray[0] = new Students(1, "Ivanov", "Ivan", "Chemistry", 4, "CH - 401", 8);
        studentsArray[1] = new Students(2, "Petrov", "Petr", "Engineering", 3, "EN - 302", 9);
        studentsArray[2] = new Students(3, "Sergeev", "Sergey", "Philology", 2, "PH - 203", 7);
        studentsArray[3] = new Students(4, "Sidirov", "Viktor", "Physics", 1, "PH - 104", 5);
        studentsArray[4] = new Students(5, "Kazimirov", "Kirill", "Computer Science ", 4, "CS - 404", 9);

        studentsArray[2].changeGroup("PH - 203");
        System.out.println(studentsArray[3].getGroup());
        studentsArray[3].changeMarkAndGroup(6, "CH - 401");

        Students student = new Students();
        Students[] studentWithHigherMark = student.getStudents(studentsArray, 7);

        System.out.print("Students with mark more than 7: ");
        for (Students s: studentWithHigherMark) {
            s.info();
        }
    }
}
//Student:
//1. Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int)
// Инициализацию студента в классе main выполнять через конструктор с параметрами.
// Также определите конструктор без параметров.
//2.Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
//3.Создать метод, который будет изменять текущую
//группу студента (сам метод в качестве параметра будет принимать новую группу)
//4. Создать метод, который будет возвращать текущую группу студента.
//5. Создать метод, который будет изменять оценку студента и группу студента.
//6. В классе main создать массив из пяти студентов.
//7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов, массив студентов у которых оценка выше переданной
//оценке в методе. (Сигнатура метода будет выглядеть так
//Public Student[]getStudents(Students[]students, int mark)
//8. В классе main из полученных студентов из пункта №7 пройтись в цикле по
//массиву и вызвать на каждом студенте метод info, который вы создавали в пункте № 2


