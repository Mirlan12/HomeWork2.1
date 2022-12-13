public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("M-fideo", "Moscow");
        OldestSalesman oldestSalesman = new OldestSalesman(shop, WorkInCompany.FOR, 25, "Mirlan");
        System.out.println(oldestSalesman.getInfo());
        oldestSalesman.GoSalesmen();
        oldestSalesman.GoSalesmen("hello");
        Shop shop1 = new Shop("M-fideo", "Moscow");
        Salesman salesman = new Salesman(shop, WorkInCompany.FIVE, 30, "Misha", 180, "Black");
        System.out.println(salesman.getInfo());
        salesman.GoSalesmen();
        Shop shop2 = new Shop("M-fideo", "Moscow");
        Salesman salesman1 = new Salesman(shop2, WorkInCompany.FOR, 45, "Roma", 175, "Black");
        System.out.println(salesman1.getInfo());
        salesman1.GoSalesmen();
    }
}