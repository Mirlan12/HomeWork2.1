public class OldestSalesman extends Supervisor {
   private Integer age;
   private String name;

   public OldestSalesman(Shop shop, WorkInCompany workInCompany, Integer age, String name) {
      super(shop, workInCompany);
      this.age = age;
      this.name = name;
   }



   public Integer getAge() {
      return age;
   }

   public String getName() {
      return name;
   }




   public void GoSalesmen(){
      System.out.println("Подойти к продавцу");
   }
   public final void GoSalesmen(String talk){
      System.out.println(talk);
   }

   @Override
   public String getInfo() {
      return super.getInfo() + "name" + name + "age" + age;

   }
}

