package edu.studentOrder.validator;

import edu.studentOrder.domaine.AnswerChildren;
import edu.studentOrder.domaine.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Check Children method is running");
        return new AnswerChildren();
    }
}
