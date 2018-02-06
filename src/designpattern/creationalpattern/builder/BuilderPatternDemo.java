/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.builder;

/**
 * Title: BuilderPatternDemo Description: Company:pusense
 * 测试方法
 * 个人思考：建造者模式的应用方面主要应是应对基础对象（ChickenBurger，Coke）的变换组合。也就是说灵活的添加基础对象及灵活的组合基础对象。建造者的基础对象可以使用工厂来产生（如果基础固定不变的话）。
 * 可以将组合方法和基础对象的添加分为不同模块互不不关心。而工厂模式工程就是对外暴露的对象，调用者不关心工程之下的实现。而建造者，可以多一层创建组合的建造者。
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class BuilderPatternDemo{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
