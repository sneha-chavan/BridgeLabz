package lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
	@FunctionalInterface
	interface IMathFunction{
		int calculate(int a, int b);
	}
	 
	public static void main(String[] args) {
		IMathFunction add = (int a, int b)-> a+b;
		IMathFunction addition = Integer::sum;
	
		
		IMathFunction multiply = (int a, int b)->a*b;
		IMathFunction division = (int x, int y)-> x/y;
		
		System.out.println("addition= "+ add.calculate(2, 5));
		System.out.println("multiplication= "+ multiply.calculate(4, 2));
		System.out.println("divition= "+division.calculate(4, 2));
		
		//UC 2.1
		//create stream and iterate to show each element
		List<Integer> list = Arrays.asList(7,2,4,9,1,6,3,8,5);
		//using lambda
		list.forEach(n -> System.out.println(n));
		//using stream
		list.forEach(System.out::println);
		
		//UC 2.2 and 2.3
		//convert into double and store values
		List doubleValues = list.stream()
							.map(Integer::doubleValue)
							.collect(Collectors.toList());
		System.out.println("int into double as List: "+ doubleValues);
		
		//UC 2.4
		//filter even number and store into list
		List evenNumbers = list.stream()
				.filter(n->n%2==0)
				.map(Integer::doubleValue)
				.collect(Collectors.toList());
		System.out.println("Even numbers into list: "+ evenNumbers);
		
		//UC 2.5
		//filter even number and store into list, Display first even number
		int firstEvenNumber = list.stream()
				.filter(n->n%2==0)
				.findFirst()
				.orElse(null);
		System.out.println("First Even number into list: "+ firstEvenNumber);
		

		//UC 2.6
		//min and max even number
		int minEven = list.stream()
				.filter(n->n%2==0)
				.min(Comparator.comparing(Integer::intValue))
				.orElse(null);
		System.out.println("Minimum Even number into list: "+ minEven);
		//max and max even number
		int maxEven = list.stream()
					.filter(n->n%2==0)
					.max(Comparator.comparing(Integer::intValue))
					.orElse(null);
		System.out.println("Maximum Even number into list: "+ maxEven);
				
		//UC 2.7
		//sum and average
		int sum = list.stream()
				.reduce(0, Integer::sum);
		System.out.println("sum: "+ sum);
		
		//average
		long count = list.stream().count();
		double average = sum/count;
		System.out.println("aevrage: "+average);
		
		//UC 2.8
		boolean allEven= list.stream().allMatch(n->n%2==0);
		boolean atLeastOneEven= list.stream().anyMatch(n->n%2==0);
		System.out.println("all Even= "+ allEven+"\t atleast one even= "+ atLeastOneEven);
		
		//UC 2.9
		List sortNumbers = list.stream()
						.sorted()
						.collect(Collectors.toList());
		
		System.out.println("sorted list: "+sortNumbers);
	}

}
