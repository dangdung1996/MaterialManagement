import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private int weight;

    public Meat(int weight) {
        this.weight = weight;
    }

    public Meat(String name, String id, LocalDate manufacturingDate, int cost, int weight) {
        super(name, id, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return getCost()*weight;
    }

    @Override
    LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(CURRENT_DAY.plusDays(5))){
            return getAmount() - (getAmount()* 0.3);
        }else if (getExpiryDate().isAfter(CURRENT_DAY.plusDays(3))){
            return getAmount() - (getAmount()*0.5);
        }else return getAmount() - (getAmount()* 0.1);
    }

    @Override
    public String  toString() {
        return super.toString()+
                "weight=" + weight +
                '}';
    }
}
