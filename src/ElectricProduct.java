import java.util.Objects;

public class ElectricProduct extends Product{
    private double voltageRate;//The voltage admitted for the product in V (volts)
    private double power;//The power consumed for the product in kW (kiloWatt)

    private String electricId;//The id of the product

    //Constructor
    public ElectricProduct(String productName,String productDescription){
        super(productName,productDescription);
        this.setElectricId();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricProduct)) return false;
        ElectricProduct that = (ElectricProduct) o;
        return Objects.equals(electricId, that.electricId);
    }

    @Override
    public int hashCode() {
        if(Objects.hash(this.getProductName(),this.getProductDescription())<0){
            return Objects.hash(this.getProductName(),this.getProductDescription())*-1;
        }
        return Objects.hash(this.getProductName(),this.getProductDescription());
    }

    @Override
    public String toString(){
        return "The resume name of the product is:\n"+this.getProductName()
                +"\nThe full description is:\n"+this.getProductDescription();
    }


    //end override methods

}
