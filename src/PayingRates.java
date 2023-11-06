public final class PayingRates {

    //Doing private the constructor the final class cant be initialized
    private PayingRates(){}
    //How much you pay per hour to a category of employee
    private static final double SELLER_RATE=10.0;
    private static final double DEPOSIT_RATE=8;
    private static final double OWNER_RATE=15;

    final static void showRates(){
        String message = "The rates per hour according to speciality are: \n" +
                "Seller: "+ getSELLER_RATE()+" USD/h"+
                "\nDeposit employee: "+getDEPOSIT_RATE()+" USD/h"+
                "\nOwner: "+getOWNER_RATE()+" USD/h";
        System.out.println(message);
    }

    public static double getSELLER_RATE() {
        return SELLER_RATE;
    }

    public static double getDEPOSIT_RATE() {
        return DEPOSIT_RATE;
    }

    public static double getOWNER_RATE() {
        return OWNER_RATE;
    }
}
