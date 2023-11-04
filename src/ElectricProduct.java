import java.util.Objects;

public class ElectricProduct extends Product{
    private double voltageRate;//The voltage admitted for the product in V (volts)
    private double power;//The power consumed for the product in kW (kiloWatt)

    private String electricId;//The id of the product

    //Constructor
    public ElectricProduct(String productName,String productDescription){
        super(productName,productDescription);
    }
    //End constructor

    //Getters and setters
    public double getVoltageRate() {
        return voltageRate;
    }

    public void setVoltageRate(double voltageRate) {
        this.voltageRate = voltageRate;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getElectricId() {
        return electricId;
    }

    public void setElectricId() {
        this.electricId = "EL"+this.hashCode();
    }

    //end getters and setters

    //methods
    //end methods

    //override methods
    @Override
    public int hashCode(){
        int multiplierPerProduct=1;
        int electricCode=1;
        electricCode=multiplierPerProduct*electricCode+ Objects.hashCode(getProductName());
        System.out.println(electricCode-1);
        electricCode=multiplierPerProduct*electricCode+Objects.hashCode(getProductDescription());
        if (electricCode<0){
            return electricCode= electricCode*(-1);
        }
        return electricCode;
    }
    //end override methods

}
