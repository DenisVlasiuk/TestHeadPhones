public class Main {

    public static void main(String[] args){

        HeadPhones sennheiser = new HeadPhones();
        sennheiser.model = "HD-25 PLUS";
        sennheiser.color = "Silver";
        sennheiser.brandName = "Sennheiser";
        sennheiser.hertz = 16-22000;
        sennheiser.producingCountry = "Germany";
        sennheiser.weight = 140;

        System.out.println(". Model: " + sennheiser.model + "\n. Color: " + sennheiser.color + "\n. Brand name: "
                + sennheiser.brandName);

    }

}
