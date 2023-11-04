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
        ElectricProduct lightBulb=new ElectricProduct("Light bulb","led light bulb");
        lightBulb.setElectricId();
        System.out.println(lightBulb.getElectricId());

        GasProduct gasBurner=new GasProduct("Gas Burner","Gas kitchen burner");
        gasBurner.setGasId();
        System.out.println(gasBurner.getGasId());

        GardenProduct shovel=new GardenProduct("Shovel","Small shovel",false);
        shovel.setGardenId();
        System.out.println(shovel.getGardenId());

    }
}