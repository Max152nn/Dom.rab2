package com.InterfacesAndLambdaExpressions.ex1;

public class ex1 {
    public static void main(String[] args) {
        Employee[] emp = {new Employee("Ivan",100),
        new Employee("Maxim",200),
        new Employee("Misha",300)};
        System.out.println(average(emp));
        System.out.println(largest(emp));
    }
    public static double average(Measurable[] objects){
        double avg=0;
        int count=0;
        for (Measurable measurable:objects){
            count++;
            avg += measurable.getMeasurable();
        }
        avg = avg/count;
        return avg;
    }

    public static String largest(Measurable[] objects){
        Employee emp=null;
        double max=0;
        for(Measurable measurable:objects){
            if(max<measurable.getMeasurable()) {
                max = measurable.getMeasurable();
                emp = (Employee) measurable;
            }
        }
        return emp.getName();
    }
}
