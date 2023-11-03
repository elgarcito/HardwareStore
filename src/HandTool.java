public class HandTool extends Product{
    boolean itCut;//If it cut like a knife, hand saw or axe

    //Constructor
    public HandTool(String productName,String productDescription){
        super(productName,productDescription);
    }
    //End constructor

    //getter and setter
    public boolean isItCut() {
        return itCut;
    }

    public void setItCut(boolean itCut) {
        this.itCut = itCut;
    }

    //end getter and setter

}
