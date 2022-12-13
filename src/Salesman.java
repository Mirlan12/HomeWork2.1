public final class Salesman extends OldestSalesman{
    private Integer high;
    private String eyeColor;

    public Salesman(Shop shop, WorkInCompany workInCompany, Integer age, String name, Integer high, String eyeColor) {
        super(shop, workInCompany, age, name);
        this.high = high;
        this.eyeColor = eyeColor;
    }

    public Integer getHigh() {
        return high;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public void GoSalesmen() {
        super.GoSalesmen();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "high" + this.high + "eyeColor" + this.eyeColor;
    }
}




