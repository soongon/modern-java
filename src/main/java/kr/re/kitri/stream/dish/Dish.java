package kr.re.kitri.stream.dish;

public class Dish {
    private String name;
    private boolean isVegiterian;
    private int calories;
    private String type;

    public Dish(String name, boolean isVegiterian, int calories, String type) {
        this.name = name;
        this.isVegiterian = isVegiterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegiterian() {
        return isVegiterian;
    }

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", isVegiterian=" + isVegiterian +
                ", calories=" + calories +
                ", type='" + type + '\'' +
                '}';
    }
}
