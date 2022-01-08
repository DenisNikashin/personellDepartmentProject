import edu.studentOrder.domaine.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.husbandFirstName = "Alex";
        studentOrder.husbandSecondName = "Rok";
        studentOrder.wifeFirstName = "Leen";
        studentOrder.wifeSecondName = "Rok";


        saveStudentOrder();
    }

    static void  saveStudentOrder() {
        System.out.println("saveStudentOrder");
    }
}
