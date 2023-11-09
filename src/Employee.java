import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Employee extends Person implements VacationAble{
    private static final Logger LOGGER= LogManager.getLogger(Employee.class);
    private String personalId;//The personal id of the worker
    private double costPerHour;//The pay per hour of the worker
    private String speciality;//What kind of job the worker does


    //Constructor
    public Employee(String personName, String personEmail, String phoneNumber,String speciality) {
        super(personName, personEmail, phoneNumber);
        this.speciality=speciality;
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

    public void setSpeciality(String speciality){
        this.speciality=speciality;
    }

    public String getSpeciality(){
        return speciality;
    }

    //end getters and setters
    //Method implementation
    @Override
    public int setVacation(String speciality){
        switch (speciality){
            case "Owner":
                return 35;
            case "seller":
                return 25;
            case "Deposit":
                return 15;
        }
        LOGGER.info("No valid speciality");
        return 0;
    }

    //end method implementation
}
