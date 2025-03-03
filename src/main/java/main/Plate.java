package main;

public class Plate {
      private String dishName;
      private int serving;

      public Plate(String dishName, int serving) {
          this.dishName = dishName;
          this.serving = serving;
      }
      public void serve(){
          System.out.println("Serving " + serving);
      }
}
