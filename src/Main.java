import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/*Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-HandTool: hammer, hand saw
4-GardenProduct:shovel, plant pot
5-HouseholdItem: kettle, broom, brush
6-WaterProduct:water filter, water pump
7-GasProduct: gas valve,etc

Also, we have:
Employee: the employee of the store.
Supplier: the one that sells the product.
Client: the one that buys the product.

We are going to find the full characteristic within each class

 */
public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private static final Logger LOGGER= LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //Example
        LOGGER.info("Hello and welcome to hardware store!");
        ElectricProduct.showSomething();
        System.out.println("ligthBulb");
        ElectricProduct lightBulb=new ElectricProduct("Light bulb","led light bulb");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(lightBulb.defineCost(1,0.01,0));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ligthBulb2");
        ElectricProduct lightBulb2=new ElectricProduct("Light bulb","led light bulb");
        System.out.println(lightBulb2.getElectricId());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ligthBulb3");
        ElectricProduct lightBulb3=new ElectricProduct("Light bulb3","led light bulb");
        lightBulb3.setStock(10);
        lightBulb3.removeStock(5);
        System.out.println(lightBulb3.getStock());
        System.out.println(lightBulb3.transactionDate());

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("gas burner");
        GasProduct gasBurner=new GasProduct("Gas Burner","Gas kitchen burner");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("gas burner2");
        GasProduct gasBurner2=new GasProduct("Gas Burner","Gas kitchen burner");
        gasBurner2.setStock(8);
        gasBurner2.removeStock(5);
        System.out.println(gasBurner2.getStock());
        System.out.println(gasBurner.transactionDate());

        System.out.println();
        System.out.println();
        System.out.println();
        ConstructionProduct sand =new ConstructionProduct("Sand","White sand","Tn");
        LOGGER.info(sand.checkLicence(true,"ABC",3));








    }
}