package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("2023001", "김민수", "컴퓨터공학", 3);
        System.out.println(s.getName() + " / " + s.getMajor() + " / " + s.getGrade() + "학년" );
        System.out.println("5학년으로 변경 ");
        s.setGrade(5); // 오류 출력
        
    }
}