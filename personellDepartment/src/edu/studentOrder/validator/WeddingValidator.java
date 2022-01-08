package edu.studentOrder.validator;

import edu.studentOrder.domaine.AnswerWedding;
import edu.studentOrder.domaine.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
