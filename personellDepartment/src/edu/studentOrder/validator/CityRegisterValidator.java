package edu.studentOrder.validator;

import edu.studentOrder.domaine.AnswerCityRegister;
import edu.studentOrder.domaine.StudentOrder;

public class CityRegisterValidator {
    public String hostName;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is running " + hostName + ", " + login + ", " + password + ".");
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
    }
}
