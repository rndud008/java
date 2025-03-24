package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades= AuthGrade.values();

        for (AuthGrade grade : authGrades){
            System.out.println("grade = " + grade.name() + ", level= " + grade.getLevel() + ", 설명 = " + grade.getDescription());
        }
    }
}
