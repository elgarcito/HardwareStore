public class GardenProduct  extends Product{
    boolean itsPoison;//Check if the product is poison or not
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

    //end getter and setter
}
