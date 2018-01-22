import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda表达式作为参数
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		Collections.sort(names, (a,b)->b.compareTo(a));
		
		System.out.println(names);
		System.out.println(names.stream().collect(Collectors.joining()));
		//lambda表达式作为参数
		final List<BigDecimal> prices = Arrays.asList(
			    new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
			    new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
			    new BigDecimal("45"), new BigDecimal("12"));
		final BigDecimal totalOfDiscountedPrices = prices.stream()
			    .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
			    .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
			    .reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
	
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");	
		System.out.println(friends.stream().collect(Collectors.joining()));
		friends.forEach(System.out::print);
		//返回lambda表达式
		final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);
		final long countFriendsStartN = friends.stream().filter(startsWithLetter.apply("N")).count();
		final List friendsStartB = friends.stream().filter(startsWithLetter.apply("B")).collect(Collectors.toList());
		//Comparator comparator
		Runnable runnable = ()->{System.out.println("JDK8");};
		runnable.run();
	}
	//高阶函数
	public static Predicate<String> checkIfStartsWith(final String letter) {
	    return name -> name.startsWith(letter);
	    
	}
}
