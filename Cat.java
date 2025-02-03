public class Cat {
    private String catName;
    private int catAge;
    private String ownerName;
    private int foodPacksAvailable;
    private int foodPacksPerDay;
    private String catPosition;

    public Cat(String catName, int catAge, String ownerName, int foodPacksPerDay) {
        this.catName = catName;
        this.catAge = catAge;
        this.ownerName = ownerName;
        this.foodPacksPerDay = foodPacksPerDay;
        this.catPosition = "Home";  // Default position
        this.foodPacksAvailable = 0;  // Initial food packs
    }

    public String getCatName() {
        return catName;
    }

    public void setFoodPacks(int foodPacks) {
        this.foodPacksAvailable = foodPacks;
    }

    public void setCatPosition(String position) {
        this.catPosition = position;
    }

    public void printInfo() {
        System.out.println("Cat name: " + this.catName + ", Cat age: " + this.catAge + ", Cat owner: " + this.ownerName +
                ", Food packs available: " + this.foodPacksAvailable + ", Food packs per day: " + this.foodPacksPerDay +
                ", Cat position: " + this.catPosition);
    }
}