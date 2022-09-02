import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class second {

    public static <T,U,R> List<R> mapMethod(List<T> product, List<U> p, BiFunction<T, U, R> func){
        List<R> list = new ArrayList<>();
        int i=0;
        for (T t : product){
            U u = p.get(i);
            list.add(func.apply(t, u));
            i++;

        }
        return list;
    }

    public  static List<Apple> getAppleList(List<Integer> appleWeights, List<String> appleCountries ){

        return  mapMethod(appleWeights,appleCountries,Apple::new);


    }

    public static List<Apple> sortReversed(List<Apple> apples1){


       // System.out.println(apples1.get(3).getWeight());

        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);

        apples1.sort(Comparator.comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getCountry));


        System.out.println(apples1);


        return apples1;





    }

    public static int getTotalWeights(List<Apple> appleList){

            return   appleList.stream()
                                .mapToInt(Apple::getWeight)
                                .sum();

    }

    public  static Map<String, List<Apple>> groupByCountry(List<Apple> appleList){
         return     appleList.stream()
                            .collect(Collectors.groupingBy(Apple::getCountry));


    }















    public static void main(String[] args) {

        List<Integer> applesWeights = Arrays.asList(1,3,5,11,13,15);
        List<String>  applesCountries = Arrays.asList("Germany","Spain","Turkey","Germany", "Netherlands","Spain");

        List<Apple> appleList =getAppleList(applesWeights,applesCountries);


        List<Apple> filteredMenu = appleList.stream()
                                            .takeWhile(apple -> apple.getWeight()>4)
                                            .collect(Collectors.toList());

            System.out.println(filteredMenu);

            System.out.println(getTotalWeights(sortReversed( appleList)));

           System.out.println(groupByCountry(sortReversed( appleList)));








    }
}

