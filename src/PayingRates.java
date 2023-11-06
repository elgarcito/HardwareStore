public final class PayingRates {
    //How much you pay per hour to a category of employee
    private final double SELLER_RATE=10.0;
    private final double DEPOSIT_RATE=8;
    private final double OWNER_RATE=15;

    final void showRates(){
        String message = "The rates per hour according to speciality are: \n" +
                "Seller: "+this.getSELLER_RATE()+" USD/h"+
                "\nDeposit employee: "+this.getDEPOSIT_RATE()+" USD/h"+
                "\nOwner: "+this.getOWNER_RATE()+" USD/h";
        System.out.println(message);
    }

    public double getSELLER_RATE() {
        return SELLER_RATE;
    }

    public double getDEPOSIT_RATE() {
        return DEPOSIT_RATE;
    }

    public double getOWNER_RATE() {
        return OWNER_RATE;
    }
}
