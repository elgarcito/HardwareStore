import java.util.Objects;

public class GasProduct extends Product {
    private String typeOfGas;// compressed gas or natural gas
    private double gasPressure;

    private String gasId;


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

    public void setGasId(){
        this.gasId= "GS"+this.hashCode();
    }

    public String getGasId(){
        return this.gasId;
    }

    //end Getter and setters


    //methods

    //end methods
    //override methods
    @Override
    public int hashCode(){
        int code=Objects.hash(getProductName(),getProductDescription());
        if (code<0){
            return code=code*-1;
        }
        return code;
    }
    //end override methods
}
