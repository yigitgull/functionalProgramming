import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {



    public <T,R> List<R> mapMethod(List<T> product, Function<T,R> func){
        List<R> list = new ArrayList<>();
        for (T t : product){
            list.add(func.apply(t));
        }
        return list;
    }

    public static void sortReversed(){
        Main main = new Main();

        List<Integer> applesWeights = Arrays.asList(1,3,5,7,9,11,13,15);
        List<Apple> apples1 = main.mapMethod(applesWeights,Apple::new);
        System.out.println(apples1.get(3).getWeight());

        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);

        apples1.sort(Comparator.comparing(Apple::getWeight)
                .reversed());
        System.out.println(apples1);


    }





    public static void main(String[] args) {
        sortReversed();










    }
}