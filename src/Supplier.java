public class Supplier extends Person {

    private String productSupplied;//What kind of product supplies

    //Constructor
    public Supplier(String personName, String personEmail, String phoneNumber,String productSuplied) {
        super(personName, personEmail, phoneNumber);
        this.productSupplied=productSuplied;
    }

    //end constructor

    //Getter and setter

    public String getProductSupplied() {
        return productSupplied;
    }

    public void setProductSupplied(String productSuplied) {
        this.productSupplied = productSuplied;
    }

    //end getter and setter

}
