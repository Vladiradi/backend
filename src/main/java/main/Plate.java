package main;

public class Plate {
      private String dishName;
      private int serving;

      public Plate(String dishName, int serving) {
          this.dishName = dishName;
          this.serving = serving;
      }
      public void serve(){
          if (serving > 0 ) {
              System.out.println("This plate is served by " + dishName);
              serving--;
              System.out.println("Portions left: " + serving);
          } else {
              System.out.println("There are no portions left");
          }
      }
      public String getDishName() {
          return dishName;
      }
      public void setDishName(String dishName) {
          this.dishName = dishName;
      }
      public int getServing() {
          return serving;
      }
      public void setServing(int serving) {
          this.serving = serving;
      }

    public static void main(String[] args) {
        Plate[] plates = {
                new Plate("Sushi", 10),
                new Plate("Sake", 20),
                new Plate("Misosoup", 30),
        }
    }
}
