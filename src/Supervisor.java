public class Supervisor {

 private Shop shop;
 private WorkInCompany workInCompany;


    public Supervisor( Shop shop, WorkInCompany workInCompany) {

        this.shop = shop;
        this.workInCompany = workInCompany;
    }

    public String getInfo(){
        return "\nShop name" + shop.getName() + "\nShop adrees" + shop.getAdrees() + "Work Company" + workInCompany;

    }
}
