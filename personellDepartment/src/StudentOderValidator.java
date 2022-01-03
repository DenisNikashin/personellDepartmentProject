public class StudentOderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            System.out.println("Start loop");
            if (studentOrder == null) {
                break;
            }
            System.out.println("Finish");

            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if (!answerCityRegister.success) {
               // continue;
                break;
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
        CityRegisterValidator cityRegisterValidator1 = new CityRegisterValidator();
        cityRegisterValidator1.hostName = "Host 1";
        cityRegisterValidator1.login = "Login 1";
        cityRegisterValidator1.password = "Password 1";
        CityRegisterValidator cityRegisterValidator2 = new CityRegisterValidator();
        cityRegisterValidator2.hostName = "Host 2";
        cityRegisterValidator2.login = "Login 2";
        cityRegisterValidator2.password = "Password 2";

        AnswerCityRegister answerCityRegister1 = cityRegisterValidator1.checkCityRegister(studentOrder);
        AnswerCityRegister answerCityRegister2 = cityRegisterValidator2.checkCityRegister(studentOrder);

        return answerCityRegister1;
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
