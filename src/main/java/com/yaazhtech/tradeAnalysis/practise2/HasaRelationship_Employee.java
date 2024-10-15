package com.yaazhtech.tradeAnalysis.practise2;


class RuleEngine {
    public int getBonusAmount(int appraisalRating) {
        if(appraisalRating >= 8 ) {
            return 8000;
        }
        else if(appraisalRating >= 4 ) {
            return 5000;
        }
        return 3000;
    }
}
public class HasaRelationship_Employee {
    private String employee_id;
    private int appraisalRating;
    private RuleEngine ruleEngine;

    @Override
    public String toString() {
        return "HasaRelationship_Employee{" +
                "employee_id='" + employee_id + '\'' +
                ", appraisalRating=" + appraisalRating +
                ", ruleEngine=" + ruleEngine.getBonusAmount(appraisalRating) +
                '}';
    }

    public HasaRelationship_Employee(String employee_id, int appraisalRating) {
        this.employee_id = employee_id;
        this.appraisalRating = appraisalRating;
        this.ruleEngine = new RuleEngine();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            HasaRelationship_Employee employee = new HasaRelationship_Employee("EMP_0"+i, i);
            System.out.println(employee);
        }
    }
}