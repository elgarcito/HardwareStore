import java.util.Objects;

public class GardenProduct  extends Product{
    private boolean itsPoison;//Check if the product is poison or not

    private String gardenId;
    //constructor
    public GardenProduct(String productName, String productDescription,boolean itsPoison){
        super(productName,productDescription);
        this.itsPoison=itsPoison;
    }
    //End constructor

    //getter and setter

    public boolean isItsPoison() {
        return itsPoison;
    }

    public void setItsPoison(boolean itsPoison) {
        this.itsPoison = itsPoison;
    }

    public String getGardenId() {
        return gardenId;
    }

    public void setGardenId() {
        this.gardenId = "GR"+this.hashCode();
    }

    //end getter and setter

    //Method override
    @Override
    public int hashCode(){
        int code=2*Objects.hash(getProductName(),getProductDescription());
        if (code<0){
            return code=code*-1;
        }
        return code;
    }

    @Override
    public String toString(){
        String poison;
        if (this.itsPoison){
            poison="poisonous";
        }else {
            poison="non poisonous";}

        return  "The resume name of the product is:\n"+this.getProductName()
                +"\nThe full description is:\n"+this.getProductDescription()
                +"\nIt is a "+poison+" product";
    }


    //end override methods

}
