import java.time.LocalDate;

public abstract class Material implements Discount  {
    public static final LocalDate CURRENT_DAY = LocalDate.now();
    private String name,id;
    private LocalDate manufacturingDate;
    private int cost;

    public Material(){}
    public Material(String name, String id, LocalDate manufacturingDate, int cost) {
        this.name = name;
        this.id = id;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//    public void setCost(int cost) {
//        this.cost = cost;
//    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public int getCost() {
        return cost;
    }




    abstract double getAmount();
    abstract LocalDate getExpiryDate();

    public Material withId(String id){
        this.id=id;
        return this;
    }
    public Material withName(String name){
        this.name=name;
        return this;
    }
    public Material withManufacturingDate(LocalDate manufacturingDate){
        this.manufacturingDate=manufacturingDate;
        return this;
    }
    public Material withCost(int cost){
        this.cost=cost;
        return this;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                ", ";
    }
}
