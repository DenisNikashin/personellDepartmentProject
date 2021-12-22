public class StudentOderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        StudentOrder studentOrder = readStudentOrder();
        AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
        AnswerWedding answerWedding = checkWedding(studentOrder);
        AnswerChildren answerChildren = checkChildren(studentOrder);
        AnswerStudent answerStudent = checkStudents(studentOrder);
        sendMail(studentOrder);
    }

    private static void sendMail(StudentOrder studentOrder) {

    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }
    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is running");
        return new AnswerCityRegister();
    }
    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Check Children method is running");
        return new AnswerChildren();
    }
    static AnswerStudent checkStudents(StudentOrder studentOrder) {
        System.out.println("Students is checking");
        return new AnswerStudent();
    }
}
