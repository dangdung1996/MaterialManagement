import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private int quantity;

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String name, String id, LocalDate manufacturingDate, int gia, int quantity) {
        super(name, id, manufacturingDate, gia);
        this.quantity = quantity;
    }

    @Override
    double getAmount() {
        return quantity * getCost();
    }
    @Override
    LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }
    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(CURRENT_DAY.plusMonths(4))){
            return getAmount() - (getAmount()*0.5);
        }else if (getExpiryDate().isAfter(CURRENT_DAY.plusMonths(2))){
            return getAmount() - (getAmount() * 0.4);
        }
        return getAmount()-(getAmount()*0.05);
    }

    @Override
    public String toString() {
        return super.toString()+
                "quantity=" + quantity +
                '}';
    }
}
