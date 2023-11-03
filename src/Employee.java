public class Employee extends Person{
    private String personalId;//The personal id of the worker
    private double costPerHour;//The pay per hour of the worker

    //Constructor
    public Employee(String personName, String personEmail, String phoneNumber) {
        super(personName, personEmail, phoneNumber);
    }
    //End constructor

    //Getter and setters

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    //end getters and setters
}
