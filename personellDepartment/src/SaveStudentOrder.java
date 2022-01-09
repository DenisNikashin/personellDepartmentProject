import edu.studentOrder.domaine.StudentOrder;

public class SaveStudentOrder {
        static StudentOrder studentOrder = new StudentOrder();
    public static void main(String[] args) {
        studentOrder.setHusbandFirstName("Alex");
        studentOrder.setHusbandSecondName("Rok");
        studentOrder.setWifeFirstName("Leen");
        studentOrder.setWifeSecondName("Rok");
        saveStudentOrder();
    }

    static void  saveStudentOrder() {
        System.out.println("saveStudentOrder " + studentOrder.getHusbandFirstName());
    }
}
