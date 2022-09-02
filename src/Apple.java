public class Apple {
    public Apple() {
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(int weight, String country) {
        this.weight = weight;
        this.country = country;
    }

    public Apple(String country) {
        this.country = country;
    }

    private int weight;
    private String country;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", country='" + country + '\'' +
                '}';
    }
}
