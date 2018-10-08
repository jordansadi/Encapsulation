package lab4;

import java.util.ArrayList;

public class HRPerson {
    private ArrayList<Employee> employees;

    public HRPerson() {
        employees = new ArrayList<>();
    }

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID) {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
        orientEmployee(e, cubeID);
    }

    public void orientEmployee(Employee e, String cubeID) {
        e.doFirstTimeOrientation(cubeID);
    }

    public void getEmployee(String ssn) {
        for (Employee e : employees) {
            if (e.getSsn().equals(ssn)) {
                e.getReportService().addData("The specified employee is " + e.getFirstName() + " ");
                e.getReportService().addData(e.getLastName());
                e.getReportService().outputReport();
                e.getReportService().clearReport();
            }
        }
    }
}