public class StudentOderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            System.out.println("Start loop");
            if (studentOrder != null) {
                break;
            }
            System.out.println("Finish");

            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if (!answerCityRegister.success) {
                continue;
            }
            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudents(studentOrder);
            sendMail(studentOrder);
        }
    }

    private static void sendMail(StudentOrder studentOrder) {
        System.out.println("The mail is checking");
    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }
    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is running");
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
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
