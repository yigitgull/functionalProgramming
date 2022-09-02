public class Transaction {

    Apple apple;
    int year;
    int value;

    public Transaction(Apple apple, int year, int value) {
        this.apple = apple;
        this.year = year;
        this.value = value;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public  int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "apple=" + apple +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
