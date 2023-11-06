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
    public static void main(String[] args) {
        //Example
        System.out.println("Hello and welcome to hardware store!");


        GardenProduct antPoison= new GardenProduct("ant poison","Poison for ants BW2021",true);
        System.out.println(antPoison.getProductName()+antPoison.isItsPoison());
        System.out.println();
        System.out.println();

        System.out.println("ligthBulb");
        ElectricProduct lightBulb=new ElectricProduct("Light bulb","led light bulb");
        System.out.println(lightBulb.getElectricId());
        System.out.println();
        System.out.println();
        System.out.println("ligthBulb2");
        ElectricProduct lightBulb2=new ElectricProduct("Light bulb","led light bulb");
        System.out.println(lightBulb2.getElectricId());
        System.out.println();
        System.out.println();
        System.out.println(lightBulb2.equals(lightBulb));
        System.out.println(lightBulb.equals(lightBulb2));



        System.out.println();
        System.out.println("gas burner");
        GasProduct gasBurner=new GasProduct("Gas Burner","Gas kitchen burner");
        System.out.println(gasBurner.getGasId());

        System.out.println();
        System.out.println("gas burner2");
        GasProduct gasBurner2=new GasProduct("Gas Burner","Gas kitchen burner");
        System.out.println(gasBurner2.getGasId());
        System.out.println();
        System.out.println(gasBurner.equals(gasBurner2));
        System.out.println(gasBurner2.equals(gasBurner));



        System.out.println();



        GardenProduct shovel=new GardenProduct("Shovel","Small shovel",false);
        System.out.println("shovel");
        System.out.println();
        System.out.println(shovel.getGardenId());
        System.out.println(shovel.hashCode());
        System.out.println(shovel.getGardenId());
        System.out.println(shovel.toString());


        GardenProduct bigShovel=new GardenProduct("Shovel","Small shovel",false);
        System.out.println(bigShovel);
        System.out.println();
        System.out.println(bigShovel.getGardenId());
        bigShovel.setGardenId();
        System.out.println(bigShovel.hashCode());
        System.out.println(bigShovel.equals(shovel));
        System.out.println(shovel.equals(bigShovel));

        PayingRates rates =new PayingRates();
        rates.showRates();

    }
}