import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manager materialManager = Manager.getInstance();
        materialManager.materials[0] = new Meat(5).withName("Dog").withId("#1234").withCost(50000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[1] = new Meat(2).withName("Cat").withId("#3424").withCost(7000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[2] = new Meat(3).withName("Fish").withId("#4543").withCost(25000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[3] = new Meat(1).withName("Dragon").withId("#2334").withCost(30000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[4] = new Meat(4).withName("Girl").withId("#8888").withCost(300000).withManufacturingDate(LocalDate.of(2021,1,10));

        materialManager.materials[5] = new CrispyFlour(21).withName("ShinsuFood").withId("#123").withCost(15000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[6] = new CrispyFlour(24).withName("NamNgu").withId("#234").withCost(25000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[7] = new CrispyFlour(44).withName("OriO").withId("#345").withCost(12000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[8] = new CrispyFlour(23).withName("AFC").withId("#456").withCost(13000).withManufacturingDate(LocalDate.of(2021,1,10));
        materialManager.materials[9] = new CrispyFlour(10).withName("KFC").withId("#567").withCost(50000).withManufacturingDate(LocalDate.of(2021,1,10));

        //show all
        for (int i = 0; i < materialManager.materials.length; i++) {
            System.out.println("Cost "+ materialManager.materials[i]+" : "+materialManager.materials[i].getAmount());
            System.out.println("RealMoney "+ materialManager.materials[i]+" : "+materialManager.materials[i].getRealMoney());
        }

    }
}
