public class GasProduct extends Product {
    private String typeOfGas;// compressed gas or natural gas
    private double gasPressure;

    //Constructor
    public GasProduct(String productName,String productDescription){
        super(productName,productDescription);
    }

    //End constructor

    //Getter and setters
    public String getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public double getGasPressure() {
        return gasPressure;
    }

    public void setGasPressure(double gasPressure) {
        this.gasPressure = gasPressure;
    }

    //end Getter and setters

}
