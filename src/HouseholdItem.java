public class HouseholdItem extends Product{
    private boolean itIsASet;//It check it the product it is a set or not for example a set of kitchen knifes
    private int unitsPerSet; //If it is a set it tells how many items it has

    //Constructor
    public HouseholdItem(String productName,String productDescription){
        super(productName,productDescription);
    }
    //end constructor

    //Getters and setters


    public boolean isItIsASet() {
        return itIsASet;
    }

    public void setItIsASet(boolean itIsASet) {
        this.itIsASet = itIsASet;
    }

    public int getUnitsPerSet() {
        return unitsPerSet;
    }

    public void setUnitsPerSet(int unitsPerSet) {
        this.unitsPerSet = unitsPerSet;
    }

    //End getters and setters
}
