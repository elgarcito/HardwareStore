public class ConstructionProduct extends RawMaterial {

    private double fraction;//How you divide it, for example price per 1 kg, 10 kg, etc
    private boolean needLicense;
    private int licenceNumberLength;


    //Constructor
    public ConstructionProduct(String rawMaterialName, String rawMaterialDescription, String unitType) {
        super(rawMaterialName, rawMaterialDescription, unitType);
    }
    //End constructor

    //Getter and setter

    public double getFraction() {
        return fraction;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }

    //end getter and setter

    //methods

    @Override
    public boolean checkLicence(boolean needLicense,String licenceId,int licenceNumberLength){
        if (needLicense){
            if (licenceNumberLength ==licenceId.length()){
                System.out.println("License is OK");
                return true;
            }else{
                System.out.println("License is not OK");
                return false;
            }
        }
        System.out.println("no licence required");
        return true;
    }

}
