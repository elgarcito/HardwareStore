public class ConstructionProduct extends RawMaterial {

    private double fraction;//How you divide it, for example price per 1 kg, 10 kg, etc

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
}
