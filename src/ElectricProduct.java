public class ElectricProduct extends Product{
    private double voltageRate;//The voltage admitted for the product in V (volts)
    private double power;//The power consumed for the product in kW (kiloWatt)

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
}
