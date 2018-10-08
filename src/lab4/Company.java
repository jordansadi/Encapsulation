package lab4;

public class Company {
    private HRPerson hr;

    public Company() {
        hr = new HRPerson();
    }

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID) {
        hr.hireEmployee(firstName, lastName, ssn, cubeID);
    }

    public HRPerson getHR() {
        return hr;
    }

    public void setHR(HRPerson hr) {
        this.hr = hr;
    }
}
