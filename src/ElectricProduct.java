import java.time.LocalDate;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElectricProduct extends Product implements Costable,Available, Sellable,StockChangeable{
    //The static product counter expand itself any time a product is created but initialice in 0 every time the
    //program initiate
    static int productCounter;
    static {
        productCounter=0;
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private static final Logger LOGGER= LogManager.getLogger(ElectricProduct.class);
    private double voltageRate;//The voltage admitted for the product in V (volts)
    private double power;//The power consumed for the product in kW (kiloWatt)
    private String electricId;//The id of the product


    //Constructor
    public ElectricProduct(String productName,String productDescription){
        super(productName,productDescription);
        this.setElectricId();
        productCounter++;
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
    public static void showSomething(){
        LOGGER.info("la la all");
    }
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

    //interface methods
    @Override
    public double defineCost(double supplierCost,double transportCost,double anotherCost){
        return supplierCost+transportCost+anotherCost;
    }

    @Override
    public boolean checkAvailability(int stock) {
        stock=this.getStock();
        if (stock<=0){
            return false;
        }
        return true;
    }

    @Override
    public void removeStock(int amountSold) {
        boolean thereIsStock=this.checkAvailability(this.getStock());
        if(thereIsStock && amountSold<=this.getStock()){
            int newStock =this.getStock()-amountSold;
            this.setStock(newStock);
            LOGGER.info("your new stock of this electric product is: "+newStock);
        }else{
            LOGGER.info("you can't sell that amount of this electric product");
        }
    }


    @Override
    public LocalDate transactionDate(){
        LOGGER.info("the day of the transaction is \n" +
                LocalDate.now());
        return LocalDate.now();
    }


    //end interface methods

}
