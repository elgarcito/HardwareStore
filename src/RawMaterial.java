//Here we have the kind of product that tou can use to make another, for example, sand, gasoline
//or all the kind of product that you don't sell by unit
public abstract class RawMaterial {

    private String rawMaterialName;
    private String rawMaterialDescription;
    private String unitType;//For example a ton, kg, lt


    //Constructor
    public RawMaterial(String rawMaterialName,String rawMaterialDescription,String unitType){
        this.rawMaterialName=rawMaterialName;
        this.rawMaterialDescription=rawMaterialDescription;
    }
    //End constructor

    //Getter and setter

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public void setRawMaterialName(String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
    }

    public String getRawMaterialDescription() {
        return rawMaterialDescription;
    }

    public void setRawMaterialDescription(String rawMaterialDescription) {
        this.rawMaterialDescription = rawMaterialDescription;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }


    //end getter and setter

}
