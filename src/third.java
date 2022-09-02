import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class third {


    public static List<Transaction> getRandomTransactionList(List<Integer> applesWeights,List<String>  applesCountries)
    {
        List<Transaction> transactionList = new ArrayList<>();

        int year = 2010;
        int value = 3000;

        for (Apple apple : second.getAppleList(applesWeights, applesCountries)) {


            Transaction transaction = new Transaction(apple, year, value);
            transactionList.add(transaction);
            year++;
            value = value + 1000;


        }
        return transactionList;
    }
    //find all apples from Germany and sort them by weight
    public static List<Apple> getAppleByCountry(List<Transaction> transactionList, String country){
        return transactionList.stream()
                            .filter(x -> x.getApple().getCountry() == country)
                            .map(x->x.getApple())
                            .sorted(Comparator.comparing(Apple::getWeight))
                            .collect(Collectors.toList());
    }






    public static void main(String[] args) {
        List<Integer> applesWeights = Arrays.asList(1,3,5,11,13,15);
        List<String>  applesCountries = Arrays.asList("Germany","Spain","Turkey","Germany", "Netherlands","Spain");

        List<Transaction> transactionList = getRandomTransactionList(applesWeights,applesCountries);

       // System.out.println(transactionList);

        System.out.println(getAppleByCountry(transactionList,"Germany"));
















    }



}
