import CustomExeptions.*;
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

    //methods
    //This method allow us to check if the employee name is longer than the maximum it is used to
    // define the exception
    public void throwLongerEmployeeNameException(String employeeName)throws LongEmployeeNameException {
        if (employeeName.length()>20){
            LOGGER.error("The name is too long, pleas make it less than 20 characters");
        }else{
            LOGGER.info("The name is has the right length");
        }
    }
    //This check if the employee name has any number in it name
    public void throwNumberInNameException(String employeeName) throws NumberInNamesException{
        if (employeeName.contains("0") || employeeName.contains("1") || employeeName.contains("2") || employeeName.contains("3") || employeeName.contains("4") || employeeName.contains("5") || employeeName.contains("6") || employeeName.contains("7") || employeeName.contains("8") || employeeName.contains("9")) {
            LOGGER.error("The employee name has a number, please correct it");
        } else {
            LOGGER.info("The employee name not contains a number.");
        }


    }
    //This exception check Email
    public void throwEmailException(String employeeEmail) throws EmailException{
        if (!employeeEmail.contains("@gmail.com") ) {
            LOGGER.error("Please only use a @gmail.com email");
        } else {
            LOGGER.info("The gmail format is OK, only gmail mails");
        }
    }
    //This exception check the phone number length
    public void throwPhoneNumberException(String employeePhoneNumber) throws PhoneNumberException {
        if (employeePhoneNumber.length()==8) {
            LOGGER.info("The 8 digit phone number is Ok");
        } else{
            if (employeePhoneNumber.length()<8){
                LOGGER.error("The phone number it has "+employeePhoneNumber.length()+" digits, less than 8 digits");
            }else {
                LOGGER.error("The phone number it has "+employeePhoneNumber.length()+" digits, more than 8 digits");
            }
        }
    }

    //This exception checks the speciality
    public void throwEmployeeSpecialityException(String employeeSpeciality) throws EmployeeSpecialityException {
        if (employeeSpeciality.equals("seller")|| employeeSpeciality.equals("owner") || employeeSpeciality.equals("deposit")) {
        LOGGER.info("Your specialty "+employeeSpeciality+" is Ok");
        }else {
            LOGGER.error("Your speciality "+ employeeSpeciality+" doesn't exist, please" +
                    " enter a valid one: seller or deposit");
        }
    }






    //Now the method that uses the try catch and in which we use the exception.This is the one
    //that is going to be used in Main
    public void checkEmployeeData(){
        try {
            throwLongerEmployeeNameException(this.getPersonName());
            throwNumberInNameException(this.getPersonName());
            throwEmailException(this.getPersonEmail());
            throwPhoneNumberException(this.getPhoneNumber());
            throwEmployeeSpecialityException(this.speciality);
        }catch (LongEmployeeNameException | NumberInNamesException | EmailException | PhoneNumberException | EmployeeSpecialityException e){
           String message= e.getMessage();
        }finally {
            LOGGER.info("Thanks for checking the employee status");
        }

    }



    //end methods




}
