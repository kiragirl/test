/**
 * @author:liyiming
 * @date:2018年2月2日
 * Description:
 **/
package testJDK8.stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Title: CollectingIntoMaps Description:java核心技术卷二 1.9收集到映射表中 Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月2日
 **/
public class CollectingIntoMaps{

	/**
	 * @author:liyiming
	 * @date:2018年2月2日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = people().collect(Collectors.toMap(Person::getId, Person::getName));
		System.out.println(map);

		Map<Integer, Person> map2 = people().collect(Collectors.toMap(Person::getId, Function.identity()));
		System.out.println(map2);

		Map<Integer, Person> map3 = people().collect(
				Collectors.toMap(Person::getId, Function.identity(), (existValue, newValue) -> {
					throw new IllegalStateException();
				}, TreeMap::new));
		System.out.println(map3);

		Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
		Map<String, String> map4 = locales.collect(Collectors.toMap(Locale::getDisplayLanguage,
				l -> l.getDisplayLanguage(l), (existValue, newValue) -> existValue, TreeMap::new));
		System.out.println(map4);

		
		Map<String, Set<String>> map5 = locales.collect(Collectors.toMap(Locale::getDisplayLanguage,
				l -> Collections.singleton(l.getDisplayLanguage()), (a, b) -> {
					Set<String> union = new HashSet<String>(a);
					union.addAll(b);
					return union;
				}));
		System.out.println(map5);
	}

	public static Stream<Person> people() {
		return Stream.of(new Person(1001, "Peter"), new Person(1002, "Arthur"), new Person(1003, "Violet"));
	}

	public static class Person{

		private int id;
		private String name;

		public Person(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + "]";
		}

	}
}
